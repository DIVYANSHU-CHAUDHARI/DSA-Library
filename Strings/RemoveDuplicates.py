"""
https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1#
"""
#TC:O(|S|)
#SC:O(|S|)
def removeDups(self, S):
        charList = []
        for i in S:
            if i not in charList:
                charList.append(i)
        return "".join(map(str,charList))
-----------------------------------------
#TC:O(|S|)
#SC:O(|S|)

from collections import OrderedDict
class Solution:
    def removeDups(self, S):
        od = OrderedDict()

         for i in S:
            od[i] = "" 

        return ''.join(list(od.keys()))
