
import java.util.Arrays;

class Solution {
    public int fib(int n, int[] cache) {
        if (n == 0 || n == 1)
            return 1;

        if (cache[n] != -1)
            return cache[n];

        cache[n] = fib(n - 1, cache) + fib(n - 2, cache);
        return cache[n];
    }

    public int climbStairs(int n) {
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);

        return fib(n, cache);
    }
}

