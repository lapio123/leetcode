//167. Two Sum II - Input Array Is Sorted
public class TwoSum2 {
    public static int[] twoSum(int[] nums, int target) {
        int first_index = 0;
        int last_index = nums.length-1;
        while(first_index<last_index)
        {
            if (target>nums[first_index]+nums[last_index])
                first_index++;
            else if (target<nums[first_index]+nums[last_index])
                last_index--;
            else
                return new int[]{first_index+1,last_index+1};
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] res=twoSum(nums,9);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]);
        }
    }
}
