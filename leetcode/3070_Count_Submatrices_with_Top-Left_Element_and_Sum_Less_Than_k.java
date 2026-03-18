// URL: https://leetcode.com/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/submissions/1951739387/?envType=daily-question&envId=2026-03-18
//
// Problem: 3070. Count Submatrices with Top-Left Element and Sum Less Than k
//

// Solution:
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int row = 0;
        int col = 0;
        int count = 0;
        int [][] nums = new int[grid.length][grid[0].length];
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                nums[i][j] = grid[i][j];
                if(i > 0){
                    nums[i][j] += nums[i - 1][j];
                }
                if(j > 0){
                    nums[i][j] += nums[i][j - 1];
                }
                if(i > 0 && j > 0){
                    nums[i][j] -= nums[i - 1][j - 1];
                }
                if(nums[i][j] <= k){
                    count++;
                }
            }
        }
        return count;
    }
}