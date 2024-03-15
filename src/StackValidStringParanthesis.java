/*
public class StackValidStringParanthesis {

    public static boolean checkValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='[')
                stk.push(c);
            else {
                if(stk.isEmpty())
                {
                    return false;
                }
                else{
                    char top=stk.peek();
                    if(c=='}'&&top=='{'||c==')'&&top=='('||c=='['&&top==']')
                        stk.pop;
                }
            }
        }

    return false;
    }

    public static void main(String[] args) {
        StackValidStringParanthesis s = new StackValidStringParanthesis();
        if(s.checkValid("{()}"))
         System.out.println("string valid");
        else System.out.println("string invalid");
    }



}
*/
