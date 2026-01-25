# URL: https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/?envType=daily-question&envId=2026-01-25
#
# Problem: 1984. Minimum Difference Between Highest and Lowest of K Scores
#

# Solution:
class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        if k == 1:
            return 0
        nums.sort()
        ans = float('inf')
        for i in range (len(nums) - k + 1):
            ans = min(ans , nums[i + k - 1] - nums[i])
        return ans