import java.util.ArrayList;
import java.util.Arrays;
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
            com_set.add(nums2[i]);
        }
        int[] final_res = new int[nums1.length];
        int index=0;
        if(com_set.size()<h_set.size())
        {
            for(Integer i : com_set)
            {
                if(h_set.contains(i))
                {
                    final_res[index++]=i;
                }
            }
        }
        else
        {
            for(Integer i : h_set)
            {
                if(com_set.contains(i))
                {
                    final_res[index++]=i;
                }
            }
        }
        return Arrays.copyOfRange(final_res,0,index);
    }

    public static void main(String[] args) {
        int[] a1 = {2,4,5,7};
        int[] a2 = {2,2,2};
        int[] res=intersection(a1,a2);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);

    }
}
