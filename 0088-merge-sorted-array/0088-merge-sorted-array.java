class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mn=m+n-1;
        m=m-1;
        n=n-1;
        while(m>=0&&n>=0){
            if(nums1[m]<nums2[n]){
                nums1[mn--]=nums2[n--];
            }
            else{
                nums1[mn--]=nums1[m--];
            }
        }
        while(n>=0){
            nums1[mn--]=nums2[n--];
        }
    }
}