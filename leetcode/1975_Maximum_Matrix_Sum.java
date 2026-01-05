// URL: https://leetcode.com/problems/maximum-matrix-sum/description/?envType=daily-question&envId=2026-01-05
//
// Problem: 1975. Maximum Matrix Sum
//

// Solution:
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        long ans = 0;
        int neg = 0;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                min = Math.min(min,Math.abs(matrix[i][j]));
                ans += Math.abs(matrix[i][j]);
                if(matrix[i][j] < 0){
                    neg++;
                }
            }
        }
        if(neg % 2 == 0){
            return ans;
        }
        return ans - 2 * min;
    }
}