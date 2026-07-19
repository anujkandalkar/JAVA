import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] a) {
        Map<String, List<String>> b = new HashMap<>();
        
        for (String c : a) {
            char[] d = new char[26];
            for (char e : c.toCharArray()) {
                d[e - 'a']++;
            }
            
            String f = new String(d);
            
            if (!b.containsKey(f)) {
                b.put(f, new ArrayList<>());
            }
            b.get(f).add(c);
        }
        
        return new ArrayList<>(b.values());
    }
}

public class GroupAnagrams {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] a = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = s.groupAnagrams(a);
        System.out.println(result);
    }
}