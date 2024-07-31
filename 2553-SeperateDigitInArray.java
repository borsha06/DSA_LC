class Solution {
    List<Integer> arrays = new ArrayList<>();

    public int[] separateDigits(int[] nums) {
        int[] arr = new int[1000000];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 10) {
                splitDigit(nums[i]);
            } else {
                arrays.add(nums[i]);
            }

        }
        int[] arrNew = new int[arrays.size()];
        for (int i = 0; i < arrays.size(); i++) {
            arrNew[i] = arrays.get(i);
        }
        return arrNew;

    }

    public void splitDigit(int num) {
        List<Integer> arr = new ArrayList<>();
        while (num != 0) {
            int n = num % 10;
            num = num / 10;
            arr.add(n);
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            arrays.add(arr.get(i));

        }

    }
}