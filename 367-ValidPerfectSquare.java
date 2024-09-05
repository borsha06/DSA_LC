class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        int res = 0;

        if (num == 0)
            return false;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if ((long) mid * mid > (long) num) {
                high = mid - 1;
            } else if (mid * mid < num) {
                low = mid + 1;
            } else if (mid * mid == num) {
                return true;
            }

        }
        return false;

    }
}