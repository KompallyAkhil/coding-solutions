// URL: https://leetcode.com/problems/complement-of-base-10-integer/submissions/1944567351/?envType=daily-question&envId=2026-03-11
//
// Problem: 1009. Complement of Base 10 Integer
//

// Solution:
class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        String sb = "";
        for(char i : s.toCharArray()){
            sb += i == '0' ? '1' : '0';
        }
        System.out.println(sb);
        return Integer.parseInt(sb,2);
    }
}