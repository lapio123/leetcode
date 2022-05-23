import java.util.HashMap;
//此为哈希表解法，
//每次对比减去后的结果查看是否有这个值
//如果有，直接返回，说明找到了
//如果没有把现在的这个值放回哈希表
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement=0;
        for (int i=0;i<nums.length;i++)
        {
            complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
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
