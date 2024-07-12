class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1=0;
        int p2=0;
        int n1=nums1.length;
        int n2=nums2.length;
        int x=Math.min(n1,n2);
        
        List<Integer> li=new ArrayList<>();
        while(p1<n1 && p2<n2){
         if(nums1[p1]<nums2[p2]){
              p1++;
            }
            else if(nums1[p1]>nums2[p2]){
                p2++;
            }
            else{
             li.add(nums1[p1]); 
                p1++;
                p2++;
            }
        }
        int arr[]=new int[li.size()];
       for(int i=0;i<li.size();i++){
           arr[i]=li.get(i);
       }
        return arr;
    }
}