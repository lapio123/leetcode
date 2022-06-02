import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//202
public class HappyNumber {
    private static int nextInt(int n)
    {
        int sum = 0;
        int temp=0;
        while(n>0)
        {
            temp = n%10;
            sum+=temp*temp;
            n=n/10;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int temp=n;
        while(true)
        {
            temp=nextInt(temp);
            if(temp==1)
                return true;
            if(set.contains(temp))
                return false;
            set.add(temp);
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
