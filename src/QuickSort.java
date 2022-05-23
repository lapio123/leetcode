import java.util.Arrays;

public class QuickSort {

    //return an index p makes 0...p-1 <nums[p]
    //makes p+1 ... right >nums[p]
    public static int partition(int[] nums, int left, int right){
        int v_stand = nums[left];
        int j= left;
        //To make sure left+1 ... j <v;   j+1 ... i-1 >v
        for (int i= left+1;i<=right;i++){
            if(nums[i]<v_stand){
                Swap.swap(nums,j+1,i);
                j++;
            }
        }
        Swap.swap(nums,j,left);
        //After this 0 ... j-1 <V; j+1 ... right >=V
        return j;
    }
    public static void quicksortInside(int[] nums, int left, int right){
        if(left>=right)
            return;
        //Next, we need to find the partition position.
        int p = partition(nums,left,right);
        quicksortInside(nums,left,p-1);
        quicksortInside(nums,p+1,right);
    }
    public static void quickSort(int[] nums){
        quicksortInside(nums,0, nums.length-1);
    }
    public static void main(String[] args) {
        int[] nums ={0,0,1,5,86,99,2321,55,54,2,454,78996,52,2,55,78461,2,5,5,3,6,94,5};
        quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
