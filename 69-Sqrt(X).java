class Solution {
    public int mySqrt(int x) {

        int low = 1;
        int high = x;
        int res = 0;

        if (x <= 1)
            return x;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if ((long) mid * mid > (long) x) {
                high = mid - 1;
            } else if (mid * mid < x) {
                res = mid;
                low = mid + 1;
            } else if (mid * mid == x) {
                return mid;
            }

        }
        return res;

    }
}