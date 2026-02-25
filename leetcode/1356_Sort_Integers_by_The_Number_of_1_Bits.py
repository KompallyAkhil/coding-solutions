# URL: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/?envType=daily-question&envId=2026-02-25
#
# Problem: 1356. Sort Integers by The Number of 1 Bits
#

# Solution:
class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        count = []
        ans = []
        for i in arr:
            count.append((bin(i).count("1"),i))
        count.sort()
        for i in count:
            ans.append(i[1])
        return ans