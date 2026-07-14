class Solution {
    public String minWindow(String s, String t) {
        int[] a = new int[128];
        int b = t.length();
        int c = -1;
        int d = s.length() + 1;

        for (int i = 0; i < t.length(); i++) {
            a[t.charAt(i)]++;
        }

        for (int l = 0, r = 0; r < s.length(); r++) {
            if (--a[s.charAt(r)] >= 0) {
                b--;
            }
            while (b == 0) {
                if (r - l + 1 < d) {
                    c = l;
                    d = r - l + 1;
                }
                if (++a[s.charAt(l++)] > 0) {
                    b++;
                }
            }
        }

        return c == -1 ? "" : s.substring(c, c + d);
    }
}
public class MinimumWindowSubstring{
    public static void main(String[] args){
        Solution s = new Solution();
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        String res1 = s.minWindow(s1, t1);
        System.out.println(res1);
    }
}