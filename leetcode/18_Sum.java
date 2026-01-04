// URL: https://leetcode.com/problems/4sum/
//
// Problem: 18. 4Sum
//

// Solution:
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1; j < nums.length ; j++){
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l){
                    long total = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];
                    if (total == target){
                        List<Integer> pair = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        set.add(pair);
                        k++;
                        l--;
                    }
                    else if(total < target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        result.addAll(set);
        return result;
    }
}