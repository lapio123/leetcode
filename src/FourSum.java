import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
//18
public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        HashSet<List<Integer>> res = new HashSet<>();
        int low=0;
        int high=nums.length-1;
        long temp;
        for(int total_index=0;total_index<nums.length;total_index++){
            for (int index=total_index+1;index<nums.length;index++)
            {
                low = index+1;
                high = nums.length-1;
                while(low<high)
                {
                    temp=(long)nums[index]+(long)nums[low]+(long)nums[high]+(long)nums[total_index];
                    if(temp==target)
                    {
                        res.add(Arrays.asList(nums[total_index],nums[index],nums[low],nums[high]));
                        low++;
                        high--;
                    }
                    else if(temp>target)
                    {
                        high--;
                    }
                    else
                    {
                        low++;
                    }
                }
            }
        }
        List<List<Integer>> final_res = new ArrayList<>(res);
        return  final_res;
    }
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> res = fourSum(nums,-294967296);
        System.out.println(res.toString());
    }
}
