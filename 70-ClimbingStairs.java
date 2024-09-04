class Solution {
    int[] arr = new int[50];

    public int climbStairs(int n) {
        for (int i = 0; i < 50; i++) {
            arr[i] = -1;
        }
        return fibo(n);
    }

    public int fibo(int n) {
        if (n <= 2) {
            return n;
        }
        if (arr[n] != -1)
            return arr[n];
        arr[n] = fibo(n - 1) + fibo(n - 2);
        return arr[n];
    }
}