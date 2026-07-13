class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        
        while (l < r) {
            int m = l + (r - l) / 2;
            
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        
        return nums[l];
    }
}

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,4,5,1,2};
        System.out.println(s.findMin(nums));
    }
}
