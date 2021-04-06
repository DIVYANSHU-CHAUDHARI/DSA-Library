#Recursive approach

def countLeaves(root):
    count =  0
    def countLeavesHelper(root):
        nonlocal count
        if root is None:return
        if root.left is None and root.right is None:
            count+=1
            return None
        countLeavesHelper(root.left)
        countLeavesHelper(root.right)
    countLeavesHelper(root)
    
    return count

  #Iterative approach
  
  from queue import Queue
  
  def getLeafCount(node):
     
    # If tree is empty
    if (not node):
        return 0
 
    # Initialize empty queue.
    q = Queue()
 
    # Do level order traversal
    # starting from root
    count = 0 # Initialize count of leaves
    q.put(node)
    while (not q.empty()):
        temp = q.queue[0]
        q.get()
 
        if (temp.left != None):
            q.put(temp.left)
        if (temp.right != None):
            q.put(temp.right)
        if (temp.left == None and
            temp.right == None):
            count += 1
    return count
