public class maxArea {
    //11 max area
    public static int maxArea(int[] height) {
        int left=0;
        int right = height.length-1;
        int max_out=0;
        int temp;
        //We need to move from the shorter side, because move the long side will not give any beneficial results
        while(left<right)
        {
            if(height[left]<height[right])
            {
                temp=(right-left)*(height[left]);
                left++;
            }
            else
            {
                temp=(right-left)*(height[right]);
                right--;
            }
            if(temp>max_out)
                max_out=temp;
        }
        return max_out;
    }

    public static void main(String[] args) {
        int[] height= {2,3,10,5,7,8,9};
        maxArea(height);
        System.out.println(maxArea(height));
    }
}
