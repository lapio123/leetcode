import java.util.Arrays;

public class SortColor {
    //75 Sort Color
    public static void sortColors(int[] nums) {
        //Because the color only has 3 elements
        int[] res = new int[nums.length];
        int first_index=0;
        int res_index=0;
        for (first_index=0;first_index<nums.length;first_index++)
        {
            if (nums[first_index]==0)
            {
                res[res_index]=0;
                res_index++;
            }
        }
        for (first_index=0;first_index<nums.length;first_index++)
        {
            if (nums[first_index]==1)
            {
                res[res_index]=1;
                res_index++;
            }
        }
        for (first_index=0;first_index<nums.length;first_index++)
        {
            if (nums[first_index]==2)
            {
                res[res_index]=2;
                res_index++;
            }
        }
        for (first_index=0;first_index<nums.length;first_index++)
        {
            nums[first_index]=res[first_index];
        }

    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,0,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
}
