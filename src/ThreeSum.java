import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//重复数字需要考虑清楚，详细可以看看leetcode解析
//并且今天晚上完成 Hashset 解法
public class ThreeSum {
    //15 3 sum
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int low=0;
        int high=nums.length-1;
        int temp;
        for (int index=0;index<nums.length;index++)
        {
            low = index+1;
            high = nums.length-1;
            if(index>0 && nums[index]==nums[index-1])
                continue;
            while(low<high)
            {
                temp=nums[index]+nums[low]+nums[high];
                if(temp==0)
                {
                    res.add(Arrays.asList(nums[index],nums[low],nums[high]));
                    low++;
                    high--;
                    while(low<high&&nums[low]==nums[low-1])
                    {
                        low++;
                    }
                    while(low<high&&nums[high]==nums[high+1])
                    {
                        high--;
                    }
                }
                else if(temp>0)
                {
                    high--;
                }
                else
                {
                    low++;
                }
            }
        }
        return  res;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,0,2,2};
        List<List<Integer>> res = threeSum(nums);
        System.out.println(res.toString());
    }
}
