# URL: https://leetcode.com/problems/complement-of-base-10-integer/?envType=daily-question&envId=2026-03-11
#
# Problem: 1009. Complement of Base 10 Integer
#

# Solution:
class Solution:
    def bitwiseComplement(self, n: int) -> int:
        binary = bin(n)[2:]
        ans = ""
        for i in binary:
            if i == "1":
                ans += "0"
            else:
                ans += "1"
        return int(ans,2)