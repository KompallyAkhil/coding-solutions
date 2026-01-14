# URL: https://leetcode.com/problems/reverse-integer/
#
# Problem: 7. Reverse Integer
#

# Solution:
class Solution:
    def reverse(self, x: int) -> int:
        if x == 0:
            return 0
        if x > 0:
            sign = 1
            string = str(x)
            rev = string[::-1]
            rev_int = int(rev)
            if rev_int  <= 2**31 - 1:
                sign *= rev_int
                return sign
            return 0
        else:
            sign = -1
            string = str(x)
            rev = string[1:][::-1]
            rev_int = int(rev)
            if rev_int  <= 2**31:
                sign *= rev_int
                return sign
            return 0