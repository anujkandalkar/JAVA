class Solution {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        int b = 0;
        for (int c = 0; c < s.length(); c++) {
            b += expandFromCenter(s, c, c);
            b += expandFromCenter(s, c, c + 1);
        }
        return b;
    }

    private int expandFromCenter(String s, int d, int e) {
        int f = 0;
        while (d >= 0 && e < s.length() && s.charAt(d) == s.charAt(e)) {
            f++;
            d--;
            e++;
        }
        return f;
    }
}
public class PalindromicSubstrings {
    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.countSubstrings("aaa");
        System.out.println(result);
    }
}