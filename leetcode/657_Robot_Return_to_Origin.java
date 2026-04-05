// URL: https://leetcode.com/problems/robot-return-to-origin/submissions/1969351421/?envType=daily-question&envId=2026-04-05
//
// Problem: 657. Robot Return to Origin
//

// Solution:
class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0;
        int side = 0;
        for(char i : moves.toCharArray()){
            if(i == 'U'){
                up++;
            }
            if(i == 'D'){
                up--;
            }
            if(i == 'L'){
                side++;
            }
            if(i == 'R'){
                side--;
            }
        }
        if(up == 0 && side == 0){
            return true;
        }
        return false;
    }
}