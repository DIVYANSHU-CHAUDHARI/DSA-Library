//https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1#
//https://www.youtube.com/watch?v=aIR0s1tY2Vk

//Approach1:Check editorial Method 3
//TC:O(n)
//SC:O(1)
    //Function to remove a loop in the linked list.
class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // if(head==null || head.next!=null){
        //     return;
        // }
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null && slow!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)break;
        }   
        
        if(slow == head){
            slow = head;
            fast = head;
            while(fast.next!=slow){
                fast = fast.next;
            }
            fast.next = null;
            
        }else if(slow == fast){
            slow = head;
            while(slow.next!=fast.next){
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }
}
            
