# URL: https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
#
# Problem: Max Sum Subarray of size K
#
# Time Complexity: O(n)Auxiliary Space: O(1)

# Solution:
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        cont_sum = res = sum(arr[:k])
        for i in range(k,len(arr)):
            cont_sum = cont_sum - arr[i-k] + arr[i]
            res = max(cont_sum,res)
        return res
    }
}