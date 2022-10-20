import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class DecodeWay {
    Map<String,Integer> map = new HashMap<>();

    public int numDecodings(String s) {
        return _insidecoding(s);
    }

    private int _insidecoding(String s) {
        if(s.equals(""))
            return 1;
        if(s.charAt(0)=='0')
            return 0;
        if(s.length()==1)
            return 1;
        if(map.containsKey(s))
            return map.get(s);
        int temp = _insidecoding(s.substring(1));
        if(parseInt(s.substring(0,2))>=10&&parseInt(s.substring(0,2))<=26)
            temp+= _insidecoding(s.substring(2));
        map.put(s,temp);
        return temp;
    }
}
