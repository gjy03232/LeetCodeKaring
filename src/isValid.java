import java.util.Stack;

public class isValid {
    public static void main(String []arrg) {
        String s="{{)}";
        System.out.println( Valid(s));
    }
    private static boolean Valid(String s){
        char[] chars=s.toCharArray();
        Stack stack=new Stack();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='('||chars[i]=='{'||chars[i]=='[')
                stack.push(chars[i]);
            else{
                if(stack.empty())
                    return false;
                if(chars[i]==')'&&stack.peek().equals('(')) {
                    stack.pop();
                }
                else if(chars[i]==']'&&stack.peek().equals('[')) {
                    stack.pop();
                }
                else if(chars[i]=='}'&&stack.peek().equals('{')) {
                    stack.pop();
                }
                else
                    return false;
            }

        }
        if(stack.empty())
            return  true;
        else return false;

    }

}
