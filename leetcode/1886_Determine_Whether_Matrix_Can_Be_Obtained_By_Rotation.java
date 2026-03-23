// URL: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/submissions/1956368134/?envType=daily-question&envId=2026-03-23
//
// Problem: 1886. Determine Whether Matrix Can Be Obtained By Rotation
//

// Solution:
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // int k = 4;
        for(int k = 0 ; k < 4 ; k++){
            if(Arrays.deepEquals(mat, target)){
                return true;
            }
            for(int i = 0 ; i < mat.length ; i++){
                for(int j = i + 1 ; j < mat.length ; j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            for(int i = 0 ; i < mat.length ; i++){
                for(int j = 0 ; j < mat.length / 2 ; j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][mat.length - 1 - j];
                    mat[i][mat.length - 1 - j] = temp;
                }
            }
        }
        return false;
    }
}