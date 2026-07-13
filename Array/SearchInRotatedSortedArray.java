class Solution {
    public int search(int[] nums, int target) {
        int result = -1;
        int l = 0;
        int r = nums.length - 1;
        
        while (l <= r) {
            int m = l + (r - l) / 2;
            
            if (nums[m] == target) {
                result = m;
                return result;
            }
            
            if (nums[l] <= nums[m]) {
                if (target >= nums[l] && target < nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                if (target > nums[m] && target <= nums[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        
        return result;
    }
}



public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] Array = {-2,3,-4};
        System.out.print(s.search(Array, -2));
    }
}
