public class Fibonacci {
    public int Fibonacci(int n) {
        if (n < 1)
            return 0;
        int N = n + 1;
        int[] dp = new int[N];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
