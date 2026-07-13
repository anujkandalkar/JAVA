class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }
            
            if (currentSum > max) {
                max = currentSum;
            }
        }
        
        return max;
    }
}
class MaximumSubarray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(result);
    }
}
