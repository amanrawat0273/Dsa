class Solution {
    public void reverseString(char[] s) {
        
        int j=s.length-1;
        int n=s.length;
        for(int i=0;i<n/2;i++){
            char d= s[i];
            s[i]=s[j];
            s[j]=d;
            j--;
        }
    }
}