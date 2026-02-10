// URL: https://leetcode.com/problems/longest-balanced-subarray-i/submissions/?envType=daily-question&envId=2026-02-10
//
// Problem: 3719. Longest Balanced Subarray I
//

// Solution:
class Solution {
    public static int longestBalance(int [] nums , int start , int end){
        Set<Integer> evenSet = new HashSet<>();
        Set<Integer> oddSet = new HashSet<>();

        for (int i = start; i <= end; i++) {
            if (nums[i] % 2 == 0) {
                evenSet.add(nums[i]);
            } else {
                oddSet.add(nums[i]);
            }
        }

        return evenSet.size() == oddSet.size() ? end - start + 1 : -1;
    }
    public int longestBalanced(int[] nums) {
        int maximum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            for (int j = i ; j < nums.length ; j++){
                maximum = Math.max(maximum,longestBalance(nums,i,j));
            }
        }
        return maximum;
    }
}