# URL: https://leetcode.com/problems/first-missing-positive/
#
# Problem: 41. First Missing Positive
#

# Solution:
class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        dic = {}
        for i in nums:
            dic[i] = i
        for i in range (1,len(nums)+2):
            if i not in dic:
                return i
                break