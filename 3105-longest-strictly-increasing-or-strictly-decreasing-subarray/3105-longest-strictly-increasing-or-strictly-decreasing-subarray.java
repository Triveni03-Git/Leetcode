class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int max=1,len=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                len+=1;
                max=Math.max(max,len);
            }
            else len=1;
        }
        len=1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                len+=1;
                max=Math.max(max,len);
            }
            else len=1;
        }
        return max;
    }
}