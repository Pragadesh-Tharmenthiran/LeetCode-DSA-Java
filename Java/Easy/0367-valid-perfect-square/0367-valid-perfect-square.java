class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long midSquare = (long) mid * mid;
            if (midSquare == num) {
                return true;
            }
            else if (midSquare > num) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}