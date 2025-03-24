# LEETCODE 20 - VALID PARENTHESIS

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

### TEST CASE:

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

 

### Constraints:

    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.


## Program:

```

import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        int lenStr = s.length();
        Stack<Character> mystack = new Stack<>();
        char brac;
        char top;

        for (int i = 0 ; i < lenStr ; i++){
            brac = s.charAt(i);
            if (brac == '(' || brac== '[' || brac == '{'){
                mystack.push(brac);
            }
            else{
                if (! mystack.isEmpty()){
                    top = mystack.peek();
                    if ((brac == ')' && top == '(' ) || (brac == ']' && top == '[') || (brac== '}' && top == '{' )){
                        mystack.pop();
                    }
                    else return false;
                }
                else return false;

            }

           
        }

        return mystack.isEmpty();
    }
}


```

## OUTPUT :

![image](https://github.com/user-attachments/assets/03346bb8-4861-4149-930b-b8fb47dc4871)


