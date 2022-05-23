public class ReverseVowel {
    public static String reverseVowels(String str) {
        //345. Reverse Vowels of a String
        int left=0;
        int right=str.length()-1;
        char temp;
        char[] s = str.toCharArray();
        while (left<right)
        {
            if(!(s[left]=='a'||s[left]=='e'||s[left]=='i'||s[left]=='o'||s[left]=='u'||s[left]=='A'||s[left]=='E'||s[left]=='I'||s[left]=='O'||s[left]=='U'))
            {
                left++;
                continue;
            }
            else if(!(s[right]=='a'||s[right]=='e'||s[right]=='i'||s[right]=='o'||s[right]=='u'||s[right]=='A'||s[right]=='E'||s[right]=='I'||s[right]=='O'||s[right]=='U'))
            {
                right--;
                continue;
            }
            else
            {
                temp=s[left];
                s[left]=s[right];
                s[right]=temp;
                left++;
                right--;
            }
        }
        return new String(s);
    }

    public static void main(String[] args) {
        String str = "hEllO";
        System.out.println(reverseVowels(str));
    }
}
