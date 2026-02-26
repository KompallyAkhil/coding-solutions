// URL: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/description/?envType=daily-question&envId=2026-02-26
//
// Problem: 1404. Number of Steps to Reduce a Number in Binary Representation to One
//

// Solution:
class Solution {
    public static int steps(int n) {
        if (n == 1) return 0;
        if (n % 2 == 0) {
            return 1 + steps(n / 2);
        } else {
            return 1 + steps(n + 1);
        }
    }

    public int numSteps(String s) {
        int num = Integer.parseInt(s,2);
        return steps(num);
    }
}