import java.util.Locale;

public class ValidPalindrome {
    //NUmber 125
    public static boolean isPalindrome(String str) {
        String s=str.toLowerCase();
        int first_index=0;
        int last_index=s.length()-1;
        int flag = 0;
        while(first_index<last_index)
        {
            if(!((s.charAt(first_index)<='z'&&s.charAt(first_index)>='a')||(s.charAt(first_index)<='9'&&s.charAt(first_index)>='0')))
            {
                first_index++;
                continue;
            }
            if(!((s.charAt(last_index)<='z'&&s.charAt(last_index)>='a')||(s.charAt(last_index)<='9'&&s.charAt(last_index)>='0')))
            {
                last_index--;
                continue;
            }
            if(s.charAt(first_index)==s.charAt(last_index))
            {
                first_index++;
                last_index--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean flag = isPalindrome(str);
        System.out.println(flag);
    }
}
