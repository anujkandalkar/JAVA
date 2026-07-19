class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        
        int b = 0;
        int c = s.length() - 1;
        
        while (b < c) {
            char d = s.charAt(b);
            char e = s.charAt(c);
            
            if (!Character.isLetterOrDigit(d)) {
                b++;
            } else if (!Character.isLetterOrDigit(e)) {
                c--;
            } else {
                if (Character.toLowerCase(d) != Character.toLowerCase(e)) {
                    return false;
                }
                b++;
                c--;
            }
        }
        
        return true;
    }
}

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean result = s.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
    }
}