import java.util.*;
//49
public class GroupAna {
    public static  List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        char[] temp_arr;
        String tempstr;
        for(String str: strs){
            tempstr = str;
            temp_arr=tempstr.toCharArray();
            Arrays.sort(temp_arr);
            tempstr=String.valueOf(temp_arr);
            if(!map.containsKey(tempstr))
                map.put(tempstr,new ArrayList<>());
            map.get(tempstr).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res =groupAnagrams(strs);
        System.out.println(res);
    }
}
