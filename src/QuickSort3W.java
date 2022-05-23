import java.util.Arrays;
import java.util.Random;

public class QuickSort3W {
    public static void quickSortInside3W(int[] nums,int left, int right){
        if(left>=right)
            return;
        int v = nums[left];
        int lt = left; //[left+1 ... lt] < v
        int gt = right+1;//[gt .... right] >v
        int i= left+1;// [lt+1 ... i)==v

        while(i<gt){
            if(nums[i]<v)
            {
                Swap.swap(nums,lt+1,i);
                lt++;
                i++;
            }
            else if(nums[i]>v)
            {
                Swap.swap(nums,gt-1,i);
                //Dont need to move i here, because it also still points to the element that we need to deal with
                gt--;
            }
            else{
                i++;
            }
        }
        Swap.swap(nums,left,lt);
        quickSortInside3W(nums,left,lt-1);
        quickSortInside3W(nums,gt,right);
    }
    public static void quickSort3W(int[] nums){
        quickSortInside3W(nums,0,nums.length-1);
    }

    public static void main(String[] args) {
        int[] nums ={0,0,1,5,86,99,2321,55,54,2,454,78996,52,2,55,78461,2,5,5,3,6,94,5};
        //quickSort3W(nums);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
