class Solution {
    public String longestPalindrome(String a) {
        if (a == null || a.length() < 1) return "";
        int b = 0, c = 0;
        for (int d = 0; d < a.length(); d++) {
            int e = expandFromCenter(a, d, d);
            int f = expandFromCenter(a, d, d + 1);
            int g = Math.max(e, f);
            if (g > (c - b)) {
                b = d - (g - 1) / 2;
                c = d + g / 2;
            }
        }
        return a.substring(b, c + 1);
    }

    private int expandFromCenter(String a, int h, int i) {
        while (h >= 0 && i < a.length() && a.charAt(h) == a.charAt(i)) {
            h--;
            i++;
        }
        return i - h - 1;
    }
}

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution s = new Solution();
        String result = s.longestPalindrome("babad");
        System.out.println(result);
    }
}