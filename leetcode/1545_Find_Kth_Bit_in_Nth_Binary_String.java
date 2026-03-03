// URL: https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/?envType=daily-question&envId=2026-03-03
//
// Problem: 1545. Find Kth Bit in Nth Binary String
//

// Solution:
class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";
        for (int i = 2; i <= n; i++) {
            String Invert = InvertedString(s);
            s = s + "1" + Invert;
        }
        return s.charAt(k - 1);
    }
    public static String InvertedString(String s) {
        StringBuilder Inverted = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char bit;
            if (s.charAt(i) == '0') {
                bit = '1';
            } else {
                bit = '0';
            }
            Inverted.append(bit);
        }
        return Inverted.toString();
    }
}