// URL: https://leetcode.com/problems/apple-redistribution-into-boxes/description/?envType=daily-question&envId=2026-01-04
//
// Problem: 3074. Apple Redistribution into Boxes
//

// Solution:
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total_apples = 0;
        for(int i : apple){
            total_apples += i;
        }
        Arrays.sort(capacity);
        int boxes = 0;
        for(int j = capacity.length - 1 ; j >= 0 ; j--){
            if(total_apples <= 0){
                break;
            }
            else{
                total_apples -= capacity[j];
                boxes++;
            }
        }
        return boxes;
    }
}