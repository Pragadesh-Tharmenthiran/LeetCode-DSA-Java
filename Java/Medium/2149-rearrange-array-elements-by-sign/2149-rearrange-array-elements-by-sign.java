class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                positive[positiveIndex] = nums[i];
                positiveIndex++;
            }
            else {
                negative[negativeIndex] = nums[i];
                negativeIndex++;
            }
        }
        int index = 0;
        for (int i = 0; i < n/2; i++) {
            result[index] = positive[i];
            result[index+1] = negative[i];
            index+=2;
        }

        return result;
    }
}