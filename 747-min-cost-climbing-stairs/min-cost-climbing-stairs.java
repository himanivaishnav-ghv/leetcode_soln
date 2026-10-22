
import java.util.Arrays;

class Solution {
    public int helper(int i, int[] cost, int[] arr) {
        if (i >= cost.length)
            return 0;

        if (arr[i] != -1)
            return arr[i];

        int step1 = helper(i + 1, cost, arr);
        int step2 = helper(i + 2, cost, arr);

        arr[i] = cost[i] + Math.min(step1, step2);

        return arr[i];
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[cost.length];
        Arrays.fill(arr, -1);

        return Math.min(helper(0, cost, arr), helper(1, cost, arr));
    }
}
