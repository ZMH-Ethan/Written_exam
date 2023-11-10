package Day7;

import java.util.Stack;

public class Day7_2 {
    public boolean chkParenthesis(String a,int b) {
        if (b % 2 != 0) {
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(char c:a.toCharArray()) {
            if (c == '('){
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == '(') {
                    stack.pop();
                }
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
