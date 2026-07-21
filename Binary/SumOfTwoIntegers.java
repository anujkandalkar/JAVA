class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}

class SumOfTwoIntegers {
    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.getSum(1, 2);
        System.out.println(result);
    }
}
