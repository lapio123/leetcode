import java.util.HashMap;
import java.util.Map;

public class RangeBoomer {
    public static int distance(int[] a, int[] b)
    {
        return (int)(Math.pow(a[1]-b[1],2)+Math.pow(a[0]-b[0],2));
    }
    public static int numberOfBoomerangs(int[][] points) {
        int res=0;
        for(int i = 0; i < points.length; i++)
        {
            Map<Integer,Integer> map = new HashMap<>();
            for (int j =0;j<points.length;j++)
            {
                if(j!=i)
                {
                    if(!map.containsKey(distance(points[i],points[j])))
                        map.put(distance(points[i],points[j]),0);
                    int temp = map.get(distance(points[i],points[j]));
                    temp++;
                    map.put(distance(points[i],points[j]),temp);
                }

            }

            for (Integer item : map.values())
            {
                res+= item*(item-1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] temp ={{0,0},{1,0},{2,0}};
        System.out.println(numberOfBoomerangs(temp));
    }
}
