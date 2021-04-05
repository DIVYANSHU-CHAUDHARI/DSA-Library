'''
https://practice.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1#
'''
#Recursive approach
#TC:O(n) where n is the no. of nodes
#SC:O(height of tree)
def isIdentical(self,root1, root2):
        #Checking if both trees are empty
        if root1 == None and root2 == None:
            return True
        #Checking if one of the trees is non-empty
        if root1 == None or root2==None:
            return False

        return (root1.data == root2.data) and self.isIdentical(root1.left,root2.left) and self.isIdentical(root1.right,root2.right)


#Iterative approach
# Iterative method to find if 2 BT's are identical
#O(n + m) where m and n are number of nodes in two trees.
def areIdentical(root1, root2): 
      
    # Return true if both trees are empty  
    if (root1 and root2): 
        return True
  
    # Return false if one is empty and 
    # other is not  
    if (root1 or root2): 
        return False
  
    # Create an empty queues for  
    # simultaneous traversals  
    q1 = Queue() 
    q2 = Queue() 
  
    # Enqueue Roots of trees in  
    # respective queues  
    q1.put(root1)  
    q2.put(root2)  
  
    while (not q1.empty() and not q2.empty()): 
          
        # Get front nodes and compare them  
        n1 = q1.queue[0] 
        n2 = q2.queue[0] 
  
        if (n1.data != n2.data):  
            return False
  
        # Remove front nodes from queues  
        q1.get() 
        q2.get()  
  
        # Enqueue left children of both nodes  
        if (n1.left and n2.left): 
            q1.put(n1.left)  
            q2.put(n2.left) 
  
        # If one left child is empty and 
        # other is not  
        elif (n1.left or n2.left):  
            return False
  
        # Right child code (Similar to  
        # left child code)  
        if (n1.right and n2.right): 
            q1.put(n1.right)  
            q2.put(n2.right) 
        elif (n1.right or n2.right):  
            return False
  
    return True
# Iterative method to find if 2 BT's are identical
def areIdentical(root1, root2): 
      
    # Return true if both trees are empty  
    if (root1 and root2): 
        return True
  
    # Return false if one is empty and 
    # other is not  
    if (root1 or root2): 
        return False
  
    # Create an empty queues for  
    # simultaneous traversals  
    q1 = Queue() 
    q2 = Queue() 
  
    # Enqueue Roots of trees in  
    # respective queues  
    q1.put(root1)  
    q2.put(root2)  
  
    while (not q1.empty() and not q2.empty()): 
          
        # Get front nodes and compare them  
        n1 = q1.queue[0] 
        n2 = q2.queue[0] 
  
        if (n1.data != n2.data):  
            return False
  
        # Remove front nodes from queues  
        q1.get() 
        q2.get()  
  
        # Enqueue left children of both nodes  
        if (n1.left and n2.left): 
            q1.put(n1.left)  
            q2.put(n2.left) 
  
        # If one left child is empty and 
        # other is not  
        elif (n1.left or n2.left):  
            return False
  
        # Right child code (Similar to  
        # left child code)  
        if (n1.right and n2.right): 
            q1.put(n1.right)  
            q2.put(n2.right) 
        elif (n1.right or n2.right):  
            return False
  
    return True
