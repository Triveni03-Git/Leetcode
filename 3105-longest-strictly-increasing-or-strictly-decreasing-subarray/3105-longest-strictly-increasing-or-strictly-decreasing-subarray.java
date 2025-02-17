class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int l = 1, r = 1;
        int ans = 1;
        int n = nums.length;
        for(int i = 1 ; i < n ; i++) {
            if(nums[i] > nums[i-1]) {
                l++;
                r = 1;
                ans = Math.max(l, ans);
            }
            else if(nums[i] < nums[i-1]) {
                r++;
                l = 1;
                ans = Math.max(r, ans);
            }
            else {
                l = 1;
                r = 1;
            }
        }
        ans = Math.max(ans, Math.max(l, r));
        return ans;
    }
}