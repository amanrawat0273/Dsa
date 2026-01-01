class Solution {

    public int cs(int n,int [] dp)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1||n==2)
        {
            return n;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
       return dp[n] = cs(n-1, dp) + cs(n-2, dp);

    }

    public int climbStairs(int n) {
      
        // int l=n;
        int [] dp=new int [n+1];
        Arrays.fill(dp,-1);
          int k = cs(n,dp);
          return k;
    }
}