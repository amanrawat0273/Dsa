class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int l=0;
        for(int i:nums){
            if(i==1){
                l++;
            }else{
                ans=ans>l?ans:l;
                l=0;
            }
        }
ans=ans>l?ans:l;
        return ans;
    }
}