//https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1#
//https://www.youtube.com/watch?v=bzF9Ia1XISQ

//TC:O(n)
//Sc:O(height of tree)

class Solution
{
	ArrayList <Integer> printBoundary(Node node)
	{
	    ArrayList<Integer> result = new ArrayList<>();
	    result.add(node.data);
    
    //Traverse and add the left bottom and the right boundary
    
	    leftBoundary(node.left,result);
	    bottomBoundary(node,result);
	    rightBoundary(node.right,result);
	    return result;
	}
	
	public void leftBoundary(Node root,ArrayList<Integer> result){
    //If no left node exists return
	    if(root==null)return;
	    if(root.left!=null){
	        result.add(root.data);
	        leftBoundary(root.left,result);
	    }else if(root.right!=null){
	        result.add(root.data);
	        leftBoundary(root.right,result);
	    }
	}
	
	public static void rightBoundary(Node root,ArrayList<Integer> result){
    //If no right node exists return
	    if(root==null)return;
	    if(root.right!=null){
	        rightBoundary(root.right,result);
	        result.add(root.data);
	    }else if(root.left!=null){
	        rightBoundary(root.left,result);
	        result.add(root.data);
	    }
	}
	
	public static void bottomBoundary(Node root,ArrayList<Integer> result){
	    if(root==null)return;
	    bottomBoundary(root.left,result);
	    if(root.left==null && root.right==null)result.add(root.data);
	    bottomBoundary(root.right,result);
	}
	
}
