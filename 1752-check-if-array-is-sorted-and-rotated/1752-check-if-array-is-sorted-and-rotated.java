class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        if(n<=1) return true;
        int c=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                c+=1;
                if(c>1) return false;
            }
        }
        if(nums[0]<nums[n-1]) c+=1;
        return c<=1;
    }
}