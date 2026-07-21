class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int l = nums.length;

        for(int i = 0; i<nums.length; i++){

            sum = sum + nums[i];
        }
        int sum1 = (l*(l+1))/2;
        return sum1-sum;
        
    }
}

public class MissingNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 0, 1};
        int result = s.missingNumber(nums);
        System.out.println(result);
    }
}