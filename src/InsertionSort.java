import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] nums){
        for (int i=1;i<nums.length;i++){
            //Insertion is to make sure the elements before are smaller than this element
            //We make sure the elements before are sorted
            for (int j=i;j>0;j--){
                if(nums[j]<nums[j-1])
                    Swap.swap(nums,j,j-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums ={0,0,1,5,86,99,2321,55,54,2,3,6,94,5};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
