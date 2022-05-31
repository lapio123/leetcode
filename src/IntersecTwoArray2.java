import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersecTwoArray2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        for (int i=0;i<nums1.length;i++)
        {
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);

        }
        int temp=0;
        int[] res = new int[nums1.length];
        for(int i=0; i<nums2.length;i++)
        {
            int cnt = map1.getOrDefault(nums2[i],0);
            if(cnt>0)
            {
                res[temp]=nums2[i];
                temp++;
                cnt--;
                map1.put(nums2[i],cnt);
            }

        }
        return Arrays.copyOfRange(res,0,temp);
    }

    public static void main(String[] args) {
        int[] a1 = {2,4,5,7};
        int[] a2 = {2,2,2};
        int[] res=intersect(a1,a2);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }
}
