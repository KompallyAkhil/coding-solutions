# URL: https://leetcode.com/problems/minimum-absolute-difference/description/?envType=daily-question&envId=2026-01-26
#
# Problem: 1200. Minimum Absolute Difference
#

# Solution:
class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        arr.sort()
        val = abs(arr[0] - arr[1])
        for i in range (len(arr)-1):
            diff = abs(arr[i] - arr[i+1])
            val = min(val,diff)
        i = 0
        values = []
        while i < len(arr)-1:
            j = i + 1
            if arr[j] - arr[i] == val:
                values.append([arr[i],arr[j]])
            i += 1
        return values