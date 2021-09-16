//https://practice.geeksforgeeks.org/problems/minimum-depth-of-a-binary-tree/1#

class Solution
{
	int minDepth(Node root)
	{
	    if(root==null)return 0;
	    int lh =minDepth(root.left);
	    int rh = minDepth(root.right);
	    if(lh!=0 && rh!=0){
	        return 1 + Math.min(lh,rh);
	    }
	    //If the height of any one child node is 0 than return 
	    // 1 + the height of the other non-zero height
	    if(lh!=0 || rh!=0){
	        return lh!=0?(1 + lh):(1 + rh);
	    }
	    //If the left and right childs are null
	    //than return the height of the leaff node as 1
	    return 1;
	    
	}
}
