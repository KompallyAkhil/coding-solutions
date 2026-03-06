// URL: https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/?envType=daily-question&envId=2026-03-06
//
// Problem: 1784. Check if Binary String Has at Most One Segment of Ones
//

// Solution:
class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.contains("01")){
            return false;
        }
        return true;
    }
}