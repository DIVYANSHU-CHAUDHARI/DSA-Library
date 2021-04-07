'''
https://practice.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1
https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
'''


#Function to serialize a tree and return a list containing nodes of tree.

#We traverse the tree in a preorder fashion and append node values in A in that order.
def serialize(root, A):
  #For a None node,we are appending -1 in the list.So,-1 in A represents a None node in the tree
    if root == None:
        A.append(-1)
        return 
    A.append(root.data)
    serialize(root.left,A)
    serialize(root.right,A)
    return A

#Function to deserialize a list and construct the tree.   
def deSerialize(A):
 #AN Iterable object is created which gives us the next element everytime we call next() method.
    iterval = iter(A)
#Doit() function takes one element at a time from next(iterval).Makes a node out of it and links left and right node to this node by calling the 
#function again on its left and right child.Also returns the node after all the linking is done.
    def doit():
        val = next(iterval)
      #Base case is when we get -1.This represents a None node.Therefore no linking is required and straightaway return None
        if val==-1:
            return None
        node = Node(val)
        node.left = doit()
        node.right = doit()
        
        return node
    
    root = doit()
    return root
