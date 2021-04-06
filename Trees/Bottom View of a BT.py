'''
https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
'''
#Iterativa approach needs to be done
'''
Recursive approach:

Create a map like, map where key is the horizontal distance and value is a pair(a, b) where a is the value of the node and b is the height of the node. 
Perform a pre-order traversal of the tree. 
If the current node at a horizontal distance of h is the first we’ve seen, insert it in the map. 
Otherwise, compare the node with the existing one in map and if the height of the new node is greater, update in the Map.
'''

def bottomView(root):
    return bottomViewHelper(root,{},0,0)
    
#Preorder order traversal of the tree
def bottomViewHelper(root,hdNodeDict,hd,level):
    #If the current nodes level is greater the maxlevel seen till now
    #for the same horizontal distance or the horizontal distance is seen for the first time,
    #than update hdNodeDict for that horizontal distance
    if root == None:return
    
    if hd in hdNodeDict:
        if hdNodeDict[hd][1]<=level:
            hdNodeDict[hd] = [root.data,level]
    else:
        hdNodeDict[hd] = [root.data,level]
        
    bottomViewHelper(root.left,hdNodeDict,hd-1,level+1)
    bottomViewHelper(root.right,hdNodeDict,hd+1,level+1)
    
    result = [hdNodeDict[i][0] for i in sorted(hdNodeDict.keys())]
    
    return result
            
