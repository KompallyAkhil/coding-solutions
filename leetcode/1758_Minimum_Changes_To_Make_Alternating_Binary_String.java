// URL: https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/submissions/1938491143/?envType=daily-question&envId=2026-03-05
//
// Problem: 1758. Minimum Changes To Make Alternating Binary String
//

// Solution:
class Solution {
    public int minOperations(String s) {
        int count1 = 0;
        int count2 = 0;
        String s1 = "";
        String s2 = "";
        for(int i = 0 ; i < s.length(); i++){
            if(i % 2 == 0){
                s1 += '1';
                s2 += '0';
            }
            else{
                s1  += '0';
                s2  += '1';
            }
        }
        for(int i = 0 ; i < s1.length() ; i++){
            if(s.charAt(i) != s1.charAt(i)) count1++;
            if(s.charAt(i) != s2.charAt(i)) count2++;
        }
        System.out.println(count1);
        System.out.println(count2);
        return Math.min(count1,count2);
    }
}