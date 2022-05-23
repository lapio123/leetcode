public class KthLargest {
    public static void halfPartition(int[] nums, int k, int left, int right)
    {

        //Normal Partition
//        if(left>=right)
//            return;
//        int v =nums[left];
//        int j= left;
//        for(int i =left+1;i<=right;i++)
//        {
//            if(nums[i]<v)
//            {
//               // Swap.swap(nums,j+1,i);
//                int temp =nums[j+1];
//                nums[j+1]=nums[i];
//                nums[i]=temp;
//                j++;
//            }
//        }
//        Swap.swap(nums,left,j);
//        if(j==k)
//            return;
//        else if(j<k)
//        {
//            halfPartition(nums,k,j+1,right);
//        }
//        else
//        {
//            halfPartition(nums,k,left,j-1);
//        }

    //Three Partition
    if(left>=right)
        return;
    int v =nums[left];
    int lt = left;
    int gt = right+1;
    int i = left+1;
    while(i<gt)
    {
        if(nums[i]<v)
        {
            Swap.swap(nums,lt+1,i);
            lt++;
            i++;
        }
        else if(nums[i]>v)
        {
            Swap.swap(nums,gt-1,i);
            gt--;
        }
        else
        {
            i++;
        }
    }
    Swap.swap(nums,lt,left);
    if(k==lt)
    {
        return;
    }
    else if(k>lt)
    {
        halfPartition(nums,k,lt+1,right);
    }
    else{
        halfPartition(nums,k,0,lt-1);
    }
    }
    public static int findKthLargest(int[] nums, int k) {
        //Error Handler
        if(k > nums.length||k<=0)
            return -1;
        int index_k = nums.length-k;
        halfPartition(nums, index_k, 0 , nums.length-1);
        return nums[index_k];
    }
    public static void main(String[] args) {
        int[] nums ={0,0,1,5,86,99,2321,55,54,2,454,78996,52,2,55,78461,2,5,5,3,6,94,5};
        //findKthLargest(nums,1);
        System.out.println(findKthLargest(nums,1));
    }
}