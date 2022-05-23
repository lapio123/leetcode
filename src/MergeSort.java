import java.util.Arrays;

public class MergeSort {
    //mergesort is the inside function
    public static void merge(int[] nums, int left, int middle, int right){
        int[] temp = new int[right-left+1];
        for (int i=left;i<=right;i++)
            temp[i-left]=nums[i];


        //Remember that if we use the index_right and index_left, we need to be careful
        //The temp array must be be deducted from the left.
        int index_left = left;
        int index_right=middle+1;
        for (int i=left;i<=right;i++){
            if(index_left>middle)
            {
                nums[i]=temp[index_right-left];
                index_right++;
            }
            else if(index_right>right){
                nums[i]=temp[index_left-left];
                index_left++;
            }
            else if(temp[index_left-left]<temp[index_right-left])
            {
                nums[i]=temp[index_left-left];
                index_left++;
            }
            else{
                nums[i]=temp[index_right-left];
                index_right++;
            }
        }
    }
    public static void mergesortInside(int[] nums,int left, int right){
        if (left>=right)
        {
            return;
        }
        int mid=(left+right)/2;
        mergesortInside(nums,left,mid);
        mergesortInside(nums,mid+1,right);
        //[left......mid] [mid+1 ..... right]
        //There are two parts left - mid; mid+1 - right
        merge(nums,left,mid,right);
    }
    public static void mergeSort(int[] nums){
        mergesortInside(nums,0,nums.length-1);
    }

    public static void main(String[] args) {
        int[] nums ={0,0,1,5,86,99,2321,55,54,2,454,78996,52,2,55,78461,2,5,5,3,6,94,5};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
