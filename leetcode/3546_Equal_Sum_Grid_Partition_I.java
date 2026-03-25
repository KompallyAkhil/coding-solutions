// URL: https://leetcode.com/problems/equal-sum-grid-partition-i/submissions/1958894508/?envType=daily-question&envId=2026-03-25
//
// Problem: 3546. Equal Sum Grid Partition I
//

// Solution:
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long totalSum = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                totalSum += grid[i][j];
            }
        }
        if(totalSum % 2 != 0){
            return false;
        }
        long horizontalSum = 0;
        for(int i = 0 ; i < grid.length - 1 ; i++){
            for(int j = 0 ; j < grid[0].length ;  j++){
                horizontalSum += grid[i][j];
            }
            if(horizontalSum == totalSum - horizontalSum){
                return true;
            }
        }
        long verticalSum = 0;
        for(int j = 0 ; j < grid[0].length - 1 ; j++){
            for(int i = 0 ; i < grid.length ;  i++){
                verticalSum += grid[i][j];
            }
            if(verticalSum == totalSum - verticalSum){
                return true;
            }
        }
        return false;
    }
}