class Solution {
    public boolean isPerfectSquare(int num) {
        // if (num == 0) return false;
        int start = 1;
        int end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long)mid * (long)mid == num) {
                return true;
            }
            else if ((long)mid * (long)mid >= num) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}