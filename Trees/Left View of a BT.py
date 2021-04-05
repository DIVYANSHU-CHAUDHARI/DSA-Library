#Iterative approach
#Function to return a list containing elements of left view of the binary tree.
def LeftView(root):
    if root == None:return []
    queue = [root]
    visibleValues = []
    while len(queue)!=0:
        size = len(queue)
        for i in range(size):
            node = queue.pop(0)
            if i==0:
                visibleValues.append(node.data)
            if node.left:queue.append(node.left)
            if node.right:queue.append(node.right)
    return visibleValues
  
  #Recursive approach
  #TC:O(n)
  #SC:O(height)
  
  #Printing only those nodes where level>maxLevel
  '''
  https://www.youtube.com/watch?v=3Qjm1iX5dw8
  '''
  def LeftView(root):
    if root == None:return []
    #considering maxLevel and result as global variables
    maxLevel = -1
    visibleValues = []
    level = 0
    
    def LeftViewHelper(root,level):
        nonlocal maxLevel
        nonlocal visibleValues
        if root == None:return
        #If root is not None
        if level>maxLevel:
            visibleValues.append(root.data)
            maxLevel = level
        LeftViewHelper(root.left,level+1)
        LeftViewHelper(root.right,level+1)
        
        
    LeftViewHelper(root,level)
    
    return visibleValues
  
