# URL: https://leetcode.com/problems/4sum/
#
# Problem: 18. 4Sum
#

# Solution:
class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        s = set()
        num = []
        for i in range (len(nums)-3):
            for j in range (i+1,len(nums)):
                k = j + 1
                l = len(nums) - 1
                while k < l:
                    sums = nums[i] + nums[j] + nums[k] + nums[l]
                    if sums == target:
                        s.add(tuple(sorted((nums[i],nums[j],nums[k],nums[l]))))
                        k += 1
                        l -= 1
                    elif sums < target:
                        k += 1
                    else:
                        l -= 1
        for i in s:
            num.append(list(i))
        return num