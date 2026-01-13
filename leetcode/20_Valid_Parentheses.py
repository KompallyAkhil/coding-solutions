# URL: https://leetcode.com/problems/valid-parentheses/description/
#
# Problem: 20. Valid Parentheses
#

# Solution:
class Solution:
    def isValid(self, s: str) -> bool:
        a = []
        for i in s:
            if (i == '(' or i == '{' or i == '['):
                a.append(i)
            elif (i == ')' or i == '}' or i == ']'):
                if not a:
                    return False
                    break
                top = a.pop()
                if ((i == ')' and top!='(') or (i == '}' and top!='{') or (i == ']' and top!='[')):
                    return False
                    break
        if not a:
            return True
        return False