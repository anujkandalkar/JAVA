import java.util.Arrays;

class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}

public class CountingBits {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.countBits(5);
        System.out.println(Arrays.toString(result));
    }
}