
//https://www.geeksforgeeks.org/reverse-a-list-in-groups-of-given-size/
  
//TC:O(n)
//SC:O(n/k) (recursion)
      
class Solution
{
    
    public static Node reverse(Node node, int k)
    {
        Node curr = node;
        Node prev = null;
        Node nxt = null;
        int count = 0;
      
      //reverses the k element Linked list
        while(curr!=null && count<k){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            count++;
        }
      //linkage of new lists new head to the next lists new head using recursiom
        if(nxt!=null){
            node.next = reverse(nxt,k);
        }
        return prev;
    }
}
