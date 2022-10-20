public class IntegerBreak {

//    public int _insidebreak(int n,int[] memo)
//    {
//
//
//        if(n==1){
//            return 1;
//        }
//        if(memo[n]!=-1)
//        {
//            return memo[n];
//        }
//        int temp_max=0;
//        for(int i =1; i<=n-1;i++)
//        {
//            temp_max=Math.max(temp_max,Math.max(i*(n-i),i*_insidebreak(n-i,memo)));
//        }
//        memo[n]=temp_max;
//        return temp_max;
//    }
//    public int integerBreak(int n) {
//        int[] memo = new int[n+1];
//        for (int i=0;i<memo.length;i++)
//        {
//            memo[i]=-1;
//        }
//        return _insidebreak(n,memo);
//    }



    public int integerBreak(int n)
    {
        int[] memo = new int[n+1];
        memo[1]=1;
        //caculate the max
        for (int i=2;i<=n;i++)
        {
            for (int j=1;j<=i-1;j++)
            {
                memo[i]=Math.max(Math.max(memo[i],(i-j)*j),j*memo[i-j]);
            }
        }
        return memo[n];
    }
}
