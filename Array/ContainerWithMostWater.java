class Solution {
    public int maxArea(int[] height) {
        int x = 0;
        int r = height.length - 1;
        int l = 0;

        while (l < r) {
            int h = 0;
            if (height[l] < height[r]) {
                h = height[l];
            } else {
                h = height[r];
            }
            
            int w = r - l;
            int a = h * w;
            
            if (a > x) {
                x = a;
            }
            
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return x;
    }
}

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(s.maxArea(height));
    }
}