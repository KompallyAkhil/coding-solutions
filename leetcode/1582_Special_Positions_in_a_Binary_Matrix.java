// URL: https://leetcode.com/problems/special-positions-in-a-binary-matrix/submissions/1937276652/?envType=daily-question&envId=2026-03-04
//
// Problem: 1582. Special Positions in a Binary Matrix
//

// Solution:
class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int [] row = new int [mat.length];
        int [] col = new int [mat[0].length];
        int pairs = 0;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] == 1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] == 1 && row[i] == 1 && col[j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
}