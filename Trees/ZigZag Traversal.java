//https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1#
class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> result = new ArrayList<>();
	    Queue<Node> q = new LinkedList<>();
	    if(root == null)return result;
	    q.add(root);
	    boolean flag = false;
	    while(!q.isEmpty()){
	        int count  = q.size();
	        ArrayList<Integer> arr = new ArrayList<Integer>(count);
	        for(int i = 0;i<count;i++){
	            Node temp = q.remove();
	            if(flag){
	                arr.add(0,temp.data);
	            }else{
	                arr.add(temp.data);
	            }
	            if(temp.left!=null)q.add(temp.left);
	            if(temp.right!=null)q.add(temp.right);
	        }
	        //System.out.println(arr);
	        for(int ele:arr){
	            result.add(ele);
	        }
	      flag = !flag;;  
	    }
	    //System.out.println(result);
	    return result;
	}
}
