// URL: https://leetcode.com/problems/container-with-most-water/description/
//
// Problem: 11. Container With Most Water
//

// Solution:
class Solution {
    public int maxArea(int[] height) {
        int Area = 0;
        int i = 0;
        int j = height.length - 1;
        while (i <= j) {
            Area = Math.max(Area, (j - i) * Math.min(height[i],height[j]));
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return Area;
    }
}