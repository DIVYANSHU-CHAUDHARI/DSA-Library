'''
https://practice.geeksforgeeks.org/problems/check-for-bst/1
'''
#TC:O(n)
#SC:O(h)

# return True if the given tree is a BST, else return False
class Solution:
    def isBSTHelper(self,root,minVal,maxVal):
        # A None node is also a valid BST node
        if root==None:
            return True
        if root.data<minVal or root.data>=maxVal:
            return False
        leftisValid = self.isBSTHelper(root.left,minVal,root.data) 
        rightisValid = self.isBSTHelper(root.right,root.data,maxVal)
        return leftisValid and rightisValid

    def isBST(self, root):
        minVal = float('-inf')
        maxVal = float('inf')
        
        return self.isBSTHelper(root,minVal,maxVal)
