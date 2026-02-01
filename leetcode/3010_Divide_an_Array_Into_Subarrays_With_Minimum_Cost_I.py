# URL: https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/?envType=daily-question&envId=2026-02-01
#
# Problem: 3010. Divide an Array Into Subarrays With Minimum Cost I
#

# Solution:
class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        nums.sort()
        return nums[0] + nums[1] + nums[2]