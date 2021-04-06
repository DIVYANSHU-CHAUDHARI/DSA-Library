#TC:O(n)
#SC:O(height)

#Method
#1: It traverses the tree in a preorder fashion
#2: It keeps track of the maximum path value from the left and the right child to their leaf nodes respectively.
#3 : It adds left and right nodes value to its root node value and compares with the maxPathSum value seen till now.Updates it,if it is greater than the maxPathSum.
#4 : We skip this procedure for a leaf node where we return its value and a node with either of its child missing
#5 : In case of a node having either a left or a right node,we return the maximum path sum value from the child node that exists.

def maxPathSum(root):
    maxSum = float('-inf')
    def maxPathSumHelper(root):
        nonlocal maxSum
        
        #For leaf nodes we simply return the leaf nodes value
        if root.left is None and root.right is None:return root.data
        
        #If both childs exist only then we calculate the maxSum value
        #by adding root nodes data to the maxlength to leaf node value from the left 
        #and the right nodes
        
        if root.left and root.right:
        
            maxPathLeafLeft = maxPathSumHelper(root.left)
            maxPathLeafRight = maxPathSumHelper(root.right)
            
            
            maxPathLR = max(maxPathLeafLeft,maxPathLeafRight)
            maxSum = max(maxSum, root.data + maxPathLeafLeft + maxPathLeafRight)
        else:
            #If any one of the left or right child dosent exist,
            #we dont do the maxsum comparison as there is no 2nd leaf node to compare it with
            #because of a missing child
            if root.left : maxPathLR = maxPathSumHelper(root.left)
            if root.right : maxPathLR= maxPathSumHelper(root.right)
        #This function returns the maximum sum value from the root node to the leaf node
        #from either of the left or right child
        return root.data + maxPathLR
    maxPathSumHelper(root)
    return maxSum
