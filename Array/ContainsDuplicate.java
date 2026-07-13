import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
       for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}
class ContainsDuplicate {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] Arrays = {1, 2, 3, 1};
        boolean x = s.containsDuplicate(Arrays);
        System.out.print(x);
    }
}