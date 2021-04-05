 #Recursive apprach
def isMirror(root1,root2):
    if root1==None and root2==None:
        return True
    if root==None or root2==None:
        return False
    
    return ((root1.data==root2.data) and isMirror(root1.left,root2.right) and isMirror(root1.right,root2.left))
def isSymmetric(root):
    
    return isMirror(root,root)
  ###################################################
  
  #Iterative approach
  
      def isSymmetric(self, root):
        if root==None:
            return True
        queue = [root.left,root.right]
        while queue!=[]:
            temp_left = queue.pop(0)
            temp_right = queue.pop(0)
            
            if temp_left==None and temp_right == None:
                continue
            if temp_left==None or temp_right == None:
                return False
            if temp_left.val!=temp_right.val:
                return False
            queue.append(temp_left.left)
            queue.append(temp_right.right)
            queue.append(temp_left.right)
            queue.append(temp_right.left)
        return True
                     
