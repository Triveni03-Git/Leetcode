class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int sum=nums[0],max=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
                max=Math.max(sum,max);
            }
            else sum=nums[i];
        }
        return max;
    }
}