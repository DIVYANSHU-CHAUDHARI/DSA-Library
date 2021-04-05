 
def isMirror(root1,root2):
    if root1==None and root2==None:
        return True
    if root==None or root2==None:
        return False
    
    return ((root1.data==root2.data) and isMirror(root1.left,root2.right) and isMirror(root1.right,root2.left))
def isSymmetric(root):
    
    return isMirror(root,root)
