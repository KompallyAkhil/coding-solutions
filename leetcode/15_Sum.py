# URL: https://leetcode.com/problems/3sum/
#
# Problem: 15. 3Sum
#

# Solution:
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        num = []
        nums.sort()
        s = set()
        for i in range (len(nums)-2):
            j = i + 1
            k = len(nums) - 1
            while j < k:
                total = nums[i] + nums[j] + nums[k]
                if total == 0:
                    s.add(tuple(sorted((nums[i],nums[j],nums[k]))))
                    j += 1
                    k -= 1
                elif total < 0:
                    j += 1
                else:
                    k -= 1
        for i in s:
            num.append(list(i))
        return num