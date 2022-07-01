import java.util.HashMap;
import java.util.List;
import java.util.Map;
//454
public class FourSum2 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int item: nums1)
        {
            for(int item2: nums2) {
                int temp = map.getOrDefault(item + item2, 0);
                temp++;
                map.put((item + item2), temp);
            }
        }
        int res=0;
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums4.length;j++){
                res+=map.getOrDefault(0-nums3[i]-nums4[j], 0);

            }
        }
        return res;
    }
}
