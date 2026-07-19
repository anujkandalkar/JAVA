import java.util.*;

class Solution {
    public boolean isValid(String a) {
        Stack<Character> b = new Stack<>();
        
        for (char c : a.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                b.push(c);
            } else {
                if (b.isEmpty()) {
                    return false;
                }
                char d = b.pop();
                if ((c == ')' && d != '(') || 
                    (c == ']' && d != '[') || 
                    (c == '}' && d != '{')) {
                    return false;
                }
            }
        }
        
        return b.isEmpty();
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean result = s.isValid("()[]{}");
        System.out.println(result);
    }
}