import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);

            
            if (!set.contains(ch)) {
                set.add(ch);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}
public class LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args){
        Solution s = new Solution();
        String s1 = "abcabcbb";
        System.out.print(s.lengthOfLongestSubstring(s1));
    }
}