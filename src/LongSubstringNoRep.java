import java.util.HashMap;

public class LongSubstringNoRep {
    //3


//    public static int lengthOfLongestSubstring(String s) {
//        int[] freq=new int[256];
//        for(int i=0;i<256;i++)
//        {
//            freq[i]=-1;
//        }
//        int l=0;
//        int r=-1;
//        int res=-1;
//        while(r<s.length()-1)
//        {
//            r++;
//            //首先我们得确认这个是否为重复
//            //重复了
//            //记录left index的位置准备改变
//            if(freq[s.charAt(r)]!=-1){
//                //如果已经排除在外则不考虑
//                //如abba由于我存储的值为出现的index
//                //当到第二个b的是时候，理应将l放入第二个a的位置
//                //然后进行到第二个a的时候判断会将a出现的位置重置为第一个a后面
//                //导致混乱
//                //这就是加个判断来控制这个子串大小的原因
//                if(l<freq[s.charAt(r)]+1)
//                    l=freq[s.charAt(r)]+1;
//                freq[s.charAt(r)]=r;
//            }
//            else
//            {
//                freq[s.charAt(r)]=r;
//            }
//            if(res<(r-l+1))
//                res=(r-l+1);
//        }
//        if(res==-1)
//            return 0;
//        return res;
//    }


    //哈希表，一样的思路，character为键，index为值即可
    //一旦超过了这个范围，不进行移动
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {

        }
        return 0;
    }


    public static void main(String[] args) {
        String s = "abba";
        int res =lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
