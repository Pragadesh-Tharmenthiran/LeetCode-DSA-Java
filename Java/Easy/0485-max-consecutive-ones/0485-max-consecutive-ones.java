class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int max = 0;
    int count = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] == 1) {
        count++;
      } else {
        count = 0;
      }
      max = Math.max(max, count);
    }
    return max;
    }
}