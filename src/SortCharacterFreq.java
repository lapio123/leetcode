import java.util.*;
//451
public class SortCharacterFreq {
    public static String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character> characters = new ArrayList<>(map.keySet());
        Collections.sort(characters,(a,b)->map.get(b)-map.get(a));
        StringBuilder sb = new StringBuilder();
        for (char c: characters)
        {
            int cnt =map.get(c);
            for (int i=0;i<cnt;i++)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "tree";
        System.out.println(frequencySort(str));
    }
}
