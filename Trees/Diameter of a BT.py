  #TC:O(n)
  #SC:O(height)
  #Function to return the diameter of a Binary Tree.
    def diameter(self,root):
        maxLength = float('-inf') 
        
        #diameterHelper returns the maxlength from root node to any of the leaf nodes reachable from that root node.
        
        def diameterHelper(root):
            nonlocal maxLength
            if root == None:return 0
            
            #Max length from its left and right childs to their leaf nodes is calculated
            leftMaxLength = diameterHelper(root.left)
            rightMaxLength = diameterHelper(root.right)
            
            #Comparing Maxlength with the maximum length path passing through this particular root node
            maxLength = max(maxLength,1+leftMaxLength+rightMaxLength)
            
            
            return 1+max(leftMaxLength,rightMaxLength)
        
        diameterHelper(root)
        
        return maxLength
