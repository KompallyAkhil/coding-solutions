// URL: https://leetcode.com/problems/longest-balanced-substring-i/description/?envType=daily-question&envId=2026-02-13
//
// Problem: 3713. Longest Balanced Substring I
//

// Solution:
class Solution {
    public int longestBalanced(String s) {
        int maxi = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int [] freq = new int [26];
            for(int j = i ; j < s.length() ; j++){
                char ch = s.charAt(j);
                freq[ch - 'a']++;
                if(isSame(freq)){
                    maxi = Math.max(maxi,j - i + 1);
                }
            }
        }
        return maxi;
    }
     
    public static boolean isSame(int arr[]){
        int value = 0;
        
        for(int a : arr){
            if(a == 0) continue;
            
            if(value == 0) 
                value = a;
            else if(value != a) 
                return false;
        }
        return true;
    }
}