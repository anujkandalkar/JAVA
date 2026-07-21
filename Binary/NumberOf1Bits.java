class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
public class NumberOf1Bits {
    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.hammingWeight(128);
        System.out.println(result);
    }
}