#TC:O(n^2) if th tree is skewed
#SC:O(height)
#Function to check whether a binary tree is balanced or not.
def height(root):
    if root is None:return 0
    return 1+max(height(root.left),height(root.right))
    
def isBalanced(root):
    if root is None:return True
    left = height(root.left)
    right = height(root.right)
    #A tree here is height balanced in generel when it follows the 3 conditions:
    #1.Left subtree is height balanced
    #2.Right subtree is height balanced
    #3.The difference between heights of left subtree and right subtree is not more than 1.
    if (abs(left-right)<=1) and isBalanced(root.left) and isBalanced(root.right):return True
    
    return False
