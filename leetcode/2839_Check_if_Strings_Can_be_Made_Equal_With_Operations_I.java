// URL: https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-i/?envType=daily-question&envId=2026-03-29
//
// Problem: 2839. Check if Strings Can be Made Equal With Operations I
//

// Solution:
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        String firstSwap = "" + s1.charAt(2) + s1.charAt(1) + s1.charAt(0) + s1.charAt(3);
        String secondSwap = "" + firstSwap.charAt(0) + firstSwap.charAt(3) + firstSwap.charAt(2) + firstSwap.charAt(1);
        String thirdSwap = "" + s1.charAt(0) + s1.charAt(3) + s1.charAt(2) + s1.charAt(1);
        return s1.equals(s2) || 
               firstSwap.equals(s2) || 
               secondSwap.equals(s2) || 
               thirdSwap.equals(s2);
    }
}