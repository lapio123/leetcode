import java.util.HashMap;
import java.util.Map;
//290
public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String[] str = s.split(" ");
        if(str.length!=pattern.length())
            return false;
        for(int i= 0;i<pattern.length();i++)
        {
            if(!map.containsKey(pattern.charAt(i)))
            {
                if(map.containsValue(str[i]))
                    return false;
                map.put(pattern.charAt(i),str[i]);
            }
            else
            {
                if(!map.get(pattern.charAt(i)).equals(str[i]))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern ="abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
}
