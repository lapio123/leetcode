import java.util.HashMap;

public class MinWinSub {
    //76 minimum window
    public static String minWindow(String s, String t) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        if(t.length()>s.length())
            return "";
        for(int i=0;i<t.length();i++)
        {
            if(hmap.containsKey(t.charAt(i)))
            {
                int temp = hmap.get(t.charAt(i));
                temp++;
                hmap.replace(t.charAt(i),temp);
            }else
            {
                hmap.put(t.charAt(i),1);
            }
        }

        HashMap<Character,Integer> smap =new HashMap<>();
        int right_index=0;
        int left_index = 0;
        int com_flg=0;
        String str_res=null;
        String str_temp="";
        //这是右边的脚，准备扩大
        for(int i=0;i<s.length();i++)
        {
            int temp = smap.getOrDefault(s.charAt(i),0);
            temp++;
            smap.put(s.charAt(i),temp);
            right_index++;
            //如果这个哈希值正好等于了所需，则可以认为满足需求
            if(hmap.containsKey(s.charAt(i))&&temp==hmap.get(s.charAt(i))){
                com_flg++;
            }
            //接下来进行判断是否完成了要求
            //如果com——flg等于了hmap的长度，则说明我们完成了对字母的排列
            while(left_index<=right_index&&com_flg==hmap.size())
            {
                str_temp=s.substring(left_index,right_index);
                if(str_res==null||str_temp.length()<str_res.length())
                {
                    str_res=str_temp;
                }
                //接下里进行裁剪操作
                int temp_2 = smap.get(s.charAt(left_index));
                if(hmap.containsKey(s.charAt(left_index)))
                {
                    temp_2--;
                    smap.put(s.charAt(left_index),temp_2);
                }
                if(hmap.containsKey(s.charAt(left_index))&&temp_2<hmap.get(s.charAt(left_index))){
                    com_flg--;
                }
                left_index++;
            }

        }
        if (str_res==null)
                return "";
        return str_res;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String les = minWindow(s,t);
        System.out.println(les);
    }
}
