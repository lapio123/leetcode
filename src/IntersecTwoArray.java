import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//349
public class IntersecTwoArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h_set = new HashSet<>();
        for (int i=0;i<nums1.length;i++)
        {
            h_set.add(nums1[i]);
        }
        HashSet<Integer> com_set = new HashSet<>();
        for (int i=0;i<nums2.length;i++)
        {
            if(h_set.contains(nums2[i]))
                com_set.add(nums2[i]);
        }
        Integer[] res = new Integer[com_set.size()];
        com_set.toArray(res);
        int[] final_res = new int[res.length];
        for (int i=0;i<res.length;i++)
        {
            final_res[i]=res[i];
        }
        return final_res;
    }

    public static void main(String[] args) {
        int[] a1 = {2,4,5,7};
        int[] a2 = {2,2,2};
        int[] res=intersection(a1,a2);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);

    }
}
