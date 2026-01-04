// URL: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
//
// Problem: 17. Letter Combinations of a Phone Number
//

// Solution:
class Solution {
    public static void backtrack(String digit,int index,StringBuilder sb,List<String> ans, HashMap<Character,String> hm){
        if(index == digit.length()){
            ans.add(sb.toString());
            return;
        }
        String s = hm.get(digit.charAt(index));
        for(char i : s.toCharArray()){
            sb.append(i);
            backtrack(digit,index + 1,sb,ans,hm);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        //Use HashMap to solve the question?
        HashMap<Character,String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        List<String> ans = new ArrayList<>();
        backtrack(digits,0,new StringBuilder(),ans,hm);
        return ans;
    }
}