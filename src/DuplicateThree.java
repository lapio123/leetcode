import java.util.TreeSet;

public class DuplicateThree {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set =new TreeSet<>();
        for (int i=0;i<nums.length;i++)
        {
            if(set.floor((long)nums[i]+(long)t)!=null&&set.floor((long)nums[i]+(long)t)>=((long)nums[i]-(long)t))
            {
                return true;
            }
            set.add((long)nums[i]);
            if (set.size()>=k+1)
            {
                set.remove((long)nums[i-k]);
            }
        }
        return false;
    }
}
