class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0&&nums[i-1]==nums[i])continue; 
            int j=i+1,k=n-1;   
            while(j<k){
                int sum=nums[i]+nums[j];
                sum+=nums[k];
                if(sum==0){
                    List<Integer> li=Arrays.asList(nums[i],nums[j],nums[k]);
                    list.add(li);
                    k--;
                    j++;
                    while(j<k&&nums[j-1]==nums[j])j++;
                    while(j<k&&nums[k+1]==nums[k])k--;
                }
                else if(sum>0)k--;
                else j++;
            }
        }
        return list;
    }
}