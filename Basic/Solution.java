package Basic;
public class Solution {
    private final int MOD = 1337;

    public int superPow(int a, int[] b) {
        int result = 1;
        a %= MOD;
        for (int digit : b) {
            result = pow(result, 10) * pow(a, digit) % MOD;
        }
        return result;
    }

    private int pow(int a, int b) {
        int res = 1;
        for (int i = 0; i < b; i++) {
            res = res * a % MOD;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] b1 = {3};
        System.out.println("Output 1: " + sol.superPow(2, b1));
        int[] b2 = {1, 0};
        System.out.println("Output 2: " + sol.superPow(2, b2));
        int[] b3 = {4, 3, 3, 8, 5, 2};
        System.out.println("Output 3: " + sol.superPow(2, b3));
    }
}
