# URL: https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/submissions/1894845916/?envType=daily-question&envId=2026-01-24
#
# Problem: 1877. Minimize Maximum Pair Sum in Array
#

# Solution:
class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        nums.sort()
        i = 0
        j = len(nums) - 1
        ans = 0

        while i <= j:
            ans = max(ans , nums[i] + nums[j])
            i += 1
            j -= 1
        
        return ans