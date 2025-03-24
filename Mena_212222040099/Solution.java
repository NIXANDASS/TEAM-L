import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        int length = s.length();
    
        if (length == 1) return false;

        Stack <Character> mystack = new Stack<>();
        char top;
        for (int i = 0 ; i < length; i++){
            char brac = s.charAt(i);
            if (brac == '(' || brac =='[' || brac =='{'){
                mystack.push(brac);
            }

            else{
                if (!mystack.isEmpty()){
                    top = mystack.peek();
                    if ((brac == ')' && top =='(') || (brac == ']' && top =='[')||(brac == '}' && top =='{')){
                        mystack.pop();
                    }
                    else return false;
                }else  return false;
                
            }
            
        }

        return true;

    }
}
