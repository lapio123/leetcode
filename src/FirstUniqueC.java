import java.util.HashMap;
import java.util.Map;

public class FirstUniqueC {
    //NUmber 387

//    public static int firstUniqChar(String s) {
//        int[] freq =new int[26];
//        for (int i=0;i<s.length();i++)
//        {
//            freq[s.charAt(i)-'a']++;
//        }
//        for(int i=0;i<s.length();i++)
//        {
//            //This means that this is the first input
//            if(freq[s.charAt(i) - 'a']==1)
//                return i;
//        }
//        return -1;
//    }



    public static int firstUniqChar(String s) {
        Map<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            //This means that this is the first input
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),0);
            int temp = map.get(s.charAt(i));
            temp++;
            map.put(s.charAt(i),temp);
        }
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s ="lleecode";
        System.out.println(firstUniqChar(s));
    }
}
