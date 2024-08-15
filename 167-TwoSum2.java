class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length-1;
        int[] res = new int[2];
        int sum = 0;
        while (i < numbers.length ) {
            sum = numbers[i] + numbers[j];
            if (sum == target) {
                System.out.println(sum);
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }

        }
        return res;
    }
}