    
   '''
   https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1#
   '''
    #TC:O(1)
    #SC:O(1)
    
    #Function to delete a node without any reference to head pointer.
    def deleteNode(self,curr_node):
        #Point temp to the next node
        temp = curr_node.next
        #Copy the data of next node to current node
        curr_node.data = temp.data
        #Link temp nodes(next nodes) next to current nodes next
        curr_node.next = temp.next
        #Delete temp
        temp.next = None
