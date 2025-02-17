class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n=s1.length();
        int c1[]=new int[27];
        int c2[]=new int[27];
        int c=0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c+=1;
                if(c>2) return false;
            }
            c1[s1.charAt(i)-'a']++;
            c2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(c1[s1.charAt(i)-'a']!=c2[s1.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
}