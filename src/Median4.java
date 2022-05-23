public class Median4 {
    //4. find the median of two sorted arrays
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int total_len = nums1.length+nums2.length;
            double res=0.0;
            //We need to find the kth smallest
            if(total_len%2==1)
            {
                res=getKthSmallest(nums1,nums2,(total_len/2)+1,0,0)*1.0;
                return res;

            }
            else{

                res =getKthSmallest(nums1,nums2,(total_len/2),0,0)*1.0+getKthSmallest(nums1,nums2,(total_len/2)+1,0,0)*1.0;
                res=res/2.0;
                return res;
            }
        }
        public static int getKthSmallest(int[] nums1, int[] nums2, int k, int left_index, int right_index)
        {
            //K is larger than 0 1st, 2nd ....
            if(k==1)
            {
                if(left_index>=nums1.length)
                    return nums2[right_index];
                if(right_index>=nums2.length)
                    return nums1[left_index];
                return nums1[left_index]<nums2[right_index]?nums1[left_index]:nums2[right_index];
            }
            else{
                //In this way we need to first figure out whether there is the situation, k/2 is larger than the lenght;
                if((left_index+k/2-1) >=nums1.length)
                {
                    //To make sure how may left_index we are using
                    int temp = nums1.length - left_index;
                    if(temp<=0)
                        return nums2[right_index+(k-temp)-1];
                    if(nums1[nums1.length-1]>nums2[right_index+temp-1]){
                        return getKthSmallest(nums1,nums2,k-temp,left_index,right_index+temp);
                    }
                    else
                        return nums2[right_index+(k-temp)-1];
                }
                else if((right_index+k/2-1)>=nums2.length)
                {
                    //To make sure how many right index we could use
                    int temp = nums2.length - right_index;
                    if(temp<=0)
                        return nums1[left_index+(k-temp)-1];
                    if(nums2[nums2.length-1]>nums1[left_index+temp-1]){
                        return getKthSmallest(nums1,nums2,k-temp,left_index+temp,right_index);
                    }
                    else
                        return nums1[left_index+(k-temp)-1];
                }
                else{
                    //The normal situation
                    if(nums1[left_index+k/2-1]>nums2[right_index+k/2-1])
                        return getKthSmallest(nums1,nums2,k-k/2,left_index,right_index+k/2);
                    else
                        return getKthSmallest(nums1,nums2,k-k/2,left_index+k/2,right_index);
                }
            }
        }

    public static void main(String[] args) {
            int[] nums1 = {2,3,4};
            int[] nums2 = {1};
            double res=findMedianSortedArrays(nums1,nums2);
        System.out.println(res);
            return ;
    }
}
