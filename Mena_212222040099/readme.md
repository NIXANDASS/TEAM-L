# LEETCODE 20 - VALID PARENTHESIS

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

## Examples:

Examples1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 

Constraints:

    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.

'''
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

```


