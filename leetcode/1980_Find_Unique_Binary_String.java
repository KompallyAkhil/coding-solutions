// URL: https://leetcode.com/problems/find-unique-binary-string/submissions/1941452980/?envType=daily-question&envId=2026-03-08
//
// Problem: 1980. Find Unique Binary String
//

// Solution:
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String ans = "";
        for(int i = 0 ; i < nums.length ; i++){
            ans += nums[i].charAt(i) == '0' ? '1' : '0' ;
        }
        return ans;
    }
}