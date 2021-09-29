//https://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/1
//TC:O(n)
//SC:O(n)

//Solution in FAANG

//Step1. Insert root and null so that when we pop root we can point it to q.peek() ie null.
//Step2. Pop and if node is not null insert nodes left and right child into the queue and make the node  point to q.peek() 
//Step3. If popped node is null and there are still elements left in queue insert null
//Step4 if popped node is null and queue ie empty come out.
class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node node = q.remove();
            if(node!=null){
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
                node.nextRight = q.peek();
            }else{
                if(q.size()>0){
                    q.add(null);
                }
            }
        }
        
    }
}
