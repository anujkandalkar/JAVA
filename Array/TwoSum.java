class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = 0, b = 0;
        
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    a = i;
                    b = j;
                }
            }
        }
        
        return new int[]{a, b};
    }
}
class TwoSum{
    public static void main(String[] args){
        Solution  s = new Solution();
        int[] result =s.twoSum(new int[]{2,7,11,15}, 9);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}