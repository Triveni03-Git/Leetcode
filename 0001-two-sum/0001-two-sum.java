class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                int j=map.get(diff);
                return new int[]{i,j};
            }
            map.put(nums[i],i);
        }
        return nums;
    }
}