// URL: https://leetcode.com/problems/two-sum/
//
// Problem: 1. Two Sum
//

// Solution:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> dic = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int sums = target - nums[i];
            if(dic.containsKey(sums)){
                return new int[]{dic.get(sums), i};
            }
            else{
                dic.put(nums[i],i);
            }
        }
        return null;
    }
}