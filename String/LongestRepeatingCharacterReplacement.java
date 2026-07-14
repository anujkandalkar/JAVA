class Solution {
    public int characterReplacement(String s, int k) {
        int[] a = new int[26];
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'A']++;
            c = Math.max(c, a[s.charAt(i) - 'A']);

            if (i - b + 1 - c > k) {
                a[s.charAt(b) - 'A']--;
                b++;
            }

            d = Math.max(d, i - b + 1);
        }

        return d;
    }
}
public class LongestRepeatingCharacterReplacement{
    public static void main(String[] args){
        Solution s = new Solution();
        String s1 = "AABABBA";
        System.out.print(s.characterReplacement(s1, 1));
    }
}