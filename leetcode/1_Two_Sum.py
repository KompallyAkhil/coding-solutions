# URL: https://leetcode.com/problems/two-sum/
#
# Problem: 1. Two Sum
#

# Solution:
class Solution(object):
    def twoSum(self, nums, target):
        # for i in range (len(nums)):
        #     for j in range (i+1,len(nums)):
        #         if nums[i]+nums[j]==target:
        #             return i,j
        dic = {}
        for i in range (len(nums)):
            sums = target - nums[i]
            if sums in dic:
                return dic[sums],i
            else:
                dic[nums[i]] = i