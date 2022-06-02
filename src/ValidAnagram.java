import java.util.HashMap;
import java.util.Map;
//242
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i =0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        return map.equals(map2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abc","cba"));
    }

}
