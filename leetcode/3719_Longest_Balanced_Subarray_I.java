// URL: https://leetcode.com/problems/longest-balanced-subarray-i/submissions/1914479833/?envType=daily-question&envId=2026-02-10
//
// Problem: 3719. Longest Balanced Subarray I
//

// Solution:
class Solution {
    public int longestBalanced(int[] nums) {
        int maximum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            Set<Integer> evenSet = new HashSet<>();
            Set<Integer> oddSet = new HashSet<>();
            for (int j = i ; j < nums.length ; j++){
                if (nums[j] % 2 == 0)
                    evenSet.add(nums[j]);
                else
                    oddSet.add(nums[j]);

                if (evenSet.size() == oddSet.size()) {
                    maximum = Math.max(maximum,j - i + 1);
                }
            }
        }
        return maximum;
    }
}