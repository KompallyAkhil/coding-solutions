// URL: https://leetcode.com/problems/count-binary-substrings/?envType=daily-question&envId=2026-02-19
//
// Problem: 696. Count Binary Substrings
//

// Solution:
class Solution {
    public int countBinarySubstrings(String s) {
       List<Integer> result = new ArrayList<>();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.add(count);
                count = 1;
            }
        }

        result.add(count); 
        int answer = 0;
        for(int i = 0 ; i < result.size() - 1 ; i++){
            answer += Math.min(result.get(i),result.get(i + 1));
        }
        return answer;
    }
}