public class PerfectSquare {

    public static int numSquares(int n) {
        int[] memo = new int[n+1];
        for (int i=1;i<memo.length;i++){
            memo[i]=-1;
        }
        return _insidesquare(n,memo);
    }

    private static int _insidesquare(int n,int[] memo) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(memo[n]!=-1)
            return memo[n];
        int res=10000;
        for(int i=1;i*i<=n;i++)
        {

            res = Math.min(1+_insidesquare(n-i*i,memo),res);
        }
        memo[n]= res;
        return res;
    }

    public static void main(String[] args) {

        System.out.println(numSquares(13));
    }
}
