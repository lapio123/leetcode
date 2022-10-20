import java.util.HashSet;
//219
public class ContainDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++)
        {

            if (set.contains(nums[i]))
            {
                return true;
            }else
            {
                set.add(nums[i]);
                if(set.size()>=k+1)
                {
                    set.remove(nums[i-k]);
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {

    }
}
