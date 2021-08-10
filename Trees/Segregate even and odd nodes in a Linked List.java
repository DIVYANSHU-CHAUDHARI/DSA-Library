//https://www.youtube.com/watch?v=35EDBiYVEsI
//Point to note:- o.next = null is a major step.Otherwise,the program will fall into infinite loop as a circular linkedlist can form.
//TC:O(n)
class Solution{
    Node divide(int N, Node head){
        if(head==null || head.next==null)return head;
        Node eh = new Node(-1);
        Node oh = new Node(-1);
        Node e = eh;
        Node o = oh;
        Node curr  = head;
        
        while(curr!=null){
            if(curr.data%2==0){
                e.next = curr;
                e = e.next;
            }else{
                o.next = curr;
                o = o.next;
            }
            curr = curr.next;
        }
        
        e.next = oh.next;
        o.next = null;
        return eh.next;
    }
}
