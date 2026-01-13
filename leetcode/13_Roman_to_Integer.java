// URL: https://leetcode.com/problems/roman-to-integer/description/
//
// Problem: 13. Roman to Integer
//

// Solution:
class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> values = new HashMap<>();
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);

        s = s.replace("IV", "IIII").replace("IX", "VIIII");
        s = s.replace("XL", "XXXX").replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC").replace("CM", "DCCCC");

        int count = 0;
        for (Map.Entry<String, Integer> entry : values.entrySet()) {
            String k = entry.getKey();
            int v = entry.getValue();
            for (char i : s.toCharArray()) {
                if (k.charAt(0) == i) {