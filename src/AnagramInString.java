import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//438
public class AnagramInString {
    public static List<Integer> findAnagrams(String s, String p) {
        //这是一道滑动窗口+哈希表的经典例子
        if (s.length()<p.length())
            return new ArrayList<>();
        HashMap<Character,Integer> pMap = new HashMap<>();
        HashMap<Character,Integer> sMap = new HashMap<>();
        //其中我们先让哈希表填入p也就是anagram的值
        //以及出现频率
        //注意需要考虑一下是否这个值已经出现
        for (int i=0;i<p.length();i++)
        {
            if(pMap.containsKey(p.charAt(i)))
            {
                int temp=pMap.get(p.charAt(i));
                temp++;
                pMap.replace(p.charAt(i),temp);
            }
            else{
                pMap.put(p.charAt(i),1);
            }
        }


        //相同的，s也要首先确认一下
        for(int i=0;i<p.length();i++)
        {
            if(sMap.containsKey(s.charAt(i)))
            {
                int temp=sMap.get(s.charAt(i));
                temp++;
                sMap.replace(s.charAt(i),temp);
            }
            else{
                sMap.put(s.charAt(i),1);
            }
        }
        //First judge whether the array is correct or not
        //接下来就是核心步骤，需要进行哈希表的添加与删除
        List<Integer> res = new ArrayList<>();
        if(sMap.equals(pMap)==true)
        {
            res.add(0);
        }
        int ana_len = p.length();
        int index = p.length();

        //index需要记录下
        //我们需要注意一下啊
        //如果已经出现过了多次的，就是那种frequency>=2的
        //我们就需要对他进行减一操作
        while(index<s.length())
        {
            if(sMap.get(s.charAt(index-ana_len))>1)
            {
                int temp=sMap.get(s.charAt(index-ana_len));
                temp--;
                sMap.replace(s.charAt(index-ana_len),temp);
            }
            else
            {
                sMap.remove(s.charAt(index-ana_len));
            }

            if(sMap.containsKey(s.charAt(index)))
            {
                int temp=sMap.get(s.charAt(index));
                temp++;
                sMap.replace(s.charAt(index),temp);
            }
            else{
                sMap.put(s.charAt(index),1);
            }
            if(sMap.equals(pMap))
            {
                res.add(index-ana_len+1);
            }
            index++;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println("HellosWorld");
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> res = findAnagrams(s,p);
        System.out.println(res.toString());
    }
}
