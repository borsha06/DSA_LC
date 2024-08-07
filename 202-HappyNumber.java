class Solution {
    public boolean isHappy(int n) {
        boolean res = true;
        HashMap<Integer, Boolean> unhappyMap = new HashMap<>();

        unhappyMap.put(n, true);

        while (n > 1) {
            n = happyNumber(n);
            if (unhappyMap.containsKey(n)) {
                res = false;
                break;
            }
            unhappyMap.put(n, true);
        }
        return res;

    }

    public int happyNumber(int n) {
        int sum = 0;
        int rem = 0;

        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            sum += rem * rem;
        }
        return sum;

    }

}