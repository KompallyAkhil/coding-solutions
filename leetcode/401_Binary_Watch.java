// URL: https://leetcode.com/problems/binary-watch/description/?envType=daily-question&envId=2026-02-17
//
// Problem: 401. Binary Watch
//

// Solution:
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> answer = new ArrayList<>();
        for(int i = 0 ; i < 12 ; i++){
            for(int j = 0 ; j < 60 ; j++){
                if(Integer.bitCount(i) + Integer.bitCount(j) == turnedOn){
                    if(j < 10){
                        answer.add(String.format("%d:0%d",i,j));
                    }
                    else{
                        answer.add(String.format("%d:%d",i,j));
                    }
                }
            }
        }
        return answer;
    }
}