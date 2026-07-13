class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int t = max;
                max = min;
                min = t;
            }
            int a = nums[i];
            int b = max * nums[i];
            if (a > b) {
                max = a;
            } else {
                max = b;
            }
            int c = nums[i];
            int d = min * nums[i];
            if (c < d) {
                min = c;
            } else {
                min = d;
            }
            if (res < max) {
                res = max;
            }
        }
        
        return res;
    }
}

public class MaximumProductSubarray {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] Array = {-2,3,-4};
        System.out.print(s.maxProduct(Array));
    }
}
