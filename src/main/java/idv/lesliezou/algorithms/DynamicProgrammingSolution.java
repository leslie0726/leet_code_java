package idv.lesliezou.algorithms;

public class DynamicProgrammingSolution {
    public int climbStairs(int n) {
        if (n <= 3) return n;
        int prev1 = 3, prev2 = 2, cur;
        for (int i = 3; i < n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}
