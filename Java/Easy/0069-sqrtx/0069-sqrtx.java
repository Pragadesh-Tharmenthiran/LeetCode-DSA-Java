class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x/2;
        int result = 1;

        if (x < 2) {
            return x;
        }
        while  (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                result = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return result;
    }
}