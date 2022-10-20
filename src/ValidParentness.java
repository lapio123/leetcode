import java.util.Stack;

public class ValidParentness {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
            {
                s1.push(s.charAt(i));
            }
            else
            {
                if (s1.size()==0)
                    return false;
                else
                {
                    char match = s1.pop();
                    if(match=='('&&s.charAt(i)!=')')
                    {
                        return false;
                    }
                    else if(match=='['&&s.charAt(i)!=']')
                    {
                        return false;
                    }
                    else if(match=='{'&&s.charAt(i)!='}')
                    {
                        return false;
                    }
                    else
                    {
                        return false;
                    }
                }
            }

        }
        if (s1.size()!=0)
            return false;
        return true;
    }

    public static void main(String[] args) {

    }
}
