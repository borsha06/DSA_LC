class Solution {
    public int differenceOfSum(int[] nums) {

        int elemSum = elementSum(nums);
        int digSum = digitSum(nums);

        return Math.abs(elemSum - digSum);
    }

    public int elementSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int digitSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 9) {

                sum += digits(nums[i]);

            } else {
                sum += nums[i];
            }

        }
        return sum;
    }

    public int digits(int num) {
        int sum = 0;
        while (num != 0) {
            int n1 = num % 10;
            num = num / 10;
            sum += n1;
        }
        return sum;
    }
}