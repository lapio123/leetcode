import java.util.HashMap;
import java.util.Map;
//149
public class MaxpointonLine {
    public static int maxPoints(int[][] points) {
        if(points.length==0)
            return 0;
        if(points.length==1)
            return 1;
        int max=0;
        for(int i=0;i<points.length;i++)
        {
            //由于是直线，我们并不需要查看之前的点，从i之后的点进行查询即可,和boomeranger不同的是，bm是通过查看总数，而我们是要查看点数并不是其他的.
            Map<String,Integer> map = new HashMap<>();
            int temp_max=0;
            for(int k=i+1;k<points.length;k++)
            {
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[k][0];
                int y2 = points[k][1];
                String key = keystr(x1,y1,x2,y2);
                if (!map.containsKey(key))
                    map.put(key,1);
                int temp =map.get(key);
                temp++;
                map.put(key,temp);
                if (temp>temp_max)
                    temp_max=temp;
            }
            max=max>temp_max?max:temp_max;
        }
        return max;
    }
    public static String keystr(int x1, int y1, int x2, int y2)
    {
        int dx = Math.abs(x1-x2);
        int dy = Math.abs(y1-y2);
        //如果斜率是无穷大则无需考虑
        if(dy==0)
        {
            String str = "0";
            return str;
        }
        if(dx==0)
        {
            String str = "inf";
            return str;
        }
        int _gcd=gcd(dx,dy);
        String str = String.valueOf(dy/_gcd)+"/"+String.valueOf(dx/_gcd);
        if((x1<x2&&y1>y2)||(x1>x2&&y1<y2))
        {
            str="-"+str;
        }
        return str;
    }
    public static int gcd(int a, int b)
    {
        if(a%b==0)
        {
            return b;
        }
        else
        {
            return  gcd(b,a%b);
        }
    }

    public static void main(String[] args) {
        int[][] temp ={{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println(maxPoints(temp));

    }
}
