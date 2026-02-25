// URL: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/?envType=daily-question&envId=2026-02-25
//
// Problem: 1356. Sort Integers by The Number of 1 Bits
//

// Solution:
class Solution {
    public int[] sortByBits(int[] arr) {
        int [][] answer = new int [arr.length][2];
        for(int i = 0 ; i < arr.length ; i++){
            answer[i][0] = arr[i];
            answer[i][1] = Integer.bitCount(arr[i]);
            // System.out.println(Integer.bitCount(arr[i]));
        }
        Arrays.sort(answer, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        for(int i = 0 ; i < answer.length ; i++){
            arr[i] = answer[i][0];
        }
        System.out.println(Arrays.deepToString(answer));
        return arr;
    }
}