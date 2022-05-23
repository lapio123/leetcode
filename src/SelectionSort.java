import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] nums){
        //Find the smallest index

        for (int i=0;i< nums.length;i++){
            int min_index=i;
            //j stands for the
            for (int j=i+1;j< nums.length;j++)
            {
                if(nums[min_index]>nums[j])
                    min_index=j;
            }
            //swap this two elements.
            Swap.swap(nums,min_index,i);

        }
    }

    public static void main(String[] args) {
        int[] nums={5,5,9,6,3,8,9,68,7};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
