class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        int mid = 0;
        int val = 0;
        while (low <= high) {
            mid = low + ((high - low) / 2);
            int value = letters[mid];
            int targetNum = target;
            if (value > targetNum) {
                val = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (val == 0) {
            return letters[0];
        } else
            return letters[val];

    }
}