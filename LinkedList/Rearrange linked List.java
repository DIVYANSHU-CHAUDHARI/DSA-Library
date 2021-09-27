//https://practice.geeksforgeeks.org/problems/rearrange-a-linked-list/1#

class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
   
   //Intuition:
  //We can take two pointers before and after to keep track of the two linked lists as described above. 
  //These two pointers could be used two create two separate lists and then these lists could be combined to form the desired reformed list.
    void rearrangeEvenOdd(Node head)
    {
      //If one ir two nodes than no need of rearrangement
          if(head.next == null || head.next==null)return;
      
     //ot - odd tail
     //oh- odd head
      
        Node oh = head;
        Node ot = head;
        Node eh = head.next;
        Node et = head.next;
        Node temp = eh.next;
        
        ot.next = null;
        et.next = null;
      //Treatig like separate linked lists
      
        while(temp!=null){
            ot.next = temp;
            ot = temp;
            temp = temp.next;
            ot.next = null;
            if(temp==null)break;
            et.next = temp;
            et = temp;
            temp = temp.next;
            et.next = null;
        }
        ot.next = eh;
     }
}
