// URL: https://leetcode.com/problems/decode-the-slanted-ciphertext/?envType=daily-question&envId=2026-04-04
//
// Problem: 2075. Decode the Slanted Ciphertext
//

// Solution:
class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int size = encodedText.length()/rows;
        // System.out.println(encodedText.length()/rows);
        char [][] grid = new char[rows][size];
        int count = 0;
        for(int i = 0 ; i < rows; i++){
           for(int j = 0 ; j < size ; j++){
            grid[i][j] = encodedText.charAt(count);
            count++;
           }
        }
        StringBuilder result = new StringBuilder();
        for (int startCol = 0; startCol < size; startCol++) {
            int i = 0, j = startCol;

            while (i < rows && j < size) {
                result.append(grid[i][j]);
                i++;
                j++;
            }
        }

        System.out.println(result);
        // System.out.println(Arrays.deepToString(grid));
        return result.toString().stripTrailing();
    }
}