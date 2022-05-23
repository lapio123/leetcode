import static java.lang.Math.min;
//208
public class MinSizeSubSum {

    public static int minSubArrayLen(int target, int[] nums) {
        //left index and right index
        int l,r;
        l=0;
        r=-1;
        int sum = 0;
        int res = nums.length+1;
        while(l<nums.length-1)
        {
            if(sum<target&&r+1<nums.length)
            {
                r++;
                sum+=nums[r];
            }
            else
            {
                sum-=nums[l];
                l++;
            }
            //Here is the new window
            //And we need to find the result of the new window
            if(sum>=target)
            {
                res=min(res,r-l+1);
            }
        }
        if(res==nums.length+1)
            return 0;
        return res;
    }

    public static void main(String[] args) {
        int[] nums ={0,0,1,5,86,99,2321,55,54,2,454,78996,52,2,55,78461,2,5,5,3,6,94,5};
        int res=minSubArrayLen(999999,nums);
        System.out.println(res);
    }
}
