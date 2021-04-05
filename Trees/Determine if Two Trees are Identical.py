'''
https://practice.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1#
'''

def isIdentical(self,root1, root2):
        #Checking if both trees are empty
        if root1 == None and root2 == None:
            return True
        #Checking if one of the trees is non-empty
        if root1 == None or root2==None:
            return False

        return (root1.data == root2.data) and self.isIdentical(root1.left,root2.left) and self.isIdentical(root1.right,root2.right)
