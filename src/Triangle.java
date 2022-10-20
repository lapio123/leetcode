import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for (int i=0;i<triangle.size();i++)
        {
            for (int j=0;j<=i;j++)
            {
                if(i==0)
                {
                    dp[i][i]=triangle.get(i).get(j);
                }
                else if(j==0)
                {
                    dp[i][j]=dp[i-1][j]+triangle.get(i).get(j);
                }
                else if(j==i)
                {
                    dp[i][j]=dp[i-1][j-1]+triangle.get(i).get(j);
                }
                else
                {
                    dp[i][j]=Math.min(dp[i-1][j-1]+triangle.get(i).get(j),dp[i-1][j]+triangle.get(i).get(j));
                }

            }

        }
        int len =triangle.size()-1;
        int smallest=dp[len][0];
        for(int i=1;i<=len;i++)
        {
            if(dp[len][i]<smallest)
                smallest=dp[len][i];
        }
        return smallest;
    }

    public static void main(String[] args) {
        System.out.println("Hell");
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(2);
        triangle.add(new ArrayList<>());
        triangle.get(1).add(3);
        triangle.get(1).add(4);
        triangle.add(new ArrayList<>());
        triangle.get(2).add(6);
        triangle.get(2).add(5);
        triangle.get(2).add(7);
        triangle.add(new ArrayList<>());
        triangle.get(3).add(4);
        triangle.get(3).add(1);
        triangle.get(3).add(8);
        triangle.get(3).add(3);
        minimumTotal(triangle);
    }
}
