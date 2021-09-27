
//https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1

  //My solution
  //TC:O(n)
  //SC:O(1)
  class Solution{
    //Function to rotate a linked list.
    
    public Node rotate(Node head, int k) {
      
       if(head.next==null)return head;
       int length = 0;
       Node curr = head;
      //Calculating length
       while(curr!=null){
           curr = curr.next;
           length++;
       }
      
       if(length==k)return head;
      
      //Solution approach:
      
      //1.Move temp2 to the new head and update head with temp2
      //2.Move temp2 to the end of the LL and point last node to temp1
      //3.Move temp1 till temp1.next == head. and then mark temp1.next = null
      
       Node temp1 = head;
       Node temp2 = head;
       int  count = 0;
       while(count<k){
           temp2 = temp2.next;
           count++;
       }
       head =temp2;
       while(temp2.next!=null){
           temp2 = temp2.next;
       }
       temp2.next = temp1;
       while(temp1.next!=head){
           temp1 = temp1.next;
       }
       temp1.next = null;
       return head;
    }
}

//Approach2: Using circular Linked List
"""
To rotate a linked list by k, 
we can first make the linked list circular and then moving k-1 steps forward from head node, making it null and make kth node as head.
"""
#TC:O(n)
#SC:O(1)
#Using circular LinkedList
def rotate(self, head, k):
        if k == 0 or head == None or head.next == None:
            return head
        curr = head
        while curr.next:
            curr = curr.next
        curr.next = head
        curr = head
        
        while k-1>0:
            curr = curr.next
            k-=1
        head = curr.next
        curr.next = None
        
        return head
        
