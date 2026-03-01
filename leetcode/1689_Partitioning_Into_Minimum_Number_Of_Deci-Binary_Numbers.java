// URL: https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/submissions/1934769417/?envType=daily-question&envId=2026-03-01
//
// Problem: 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
//

// Solution:
class Solution {
    public int minPartitions(String n) {
        int answer = 0;
        for(char i : n.toCharArray()){
            answer = Math.max(i - '0',answer);
            System.out.println(i - '0');
        }
        return answer;
    }
}