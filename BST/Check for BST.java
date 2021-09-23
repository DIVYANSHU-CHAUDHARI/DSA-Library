public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        return isBSTHelper(root,min,max);
    }
    
    boolean isBSTHelper(Node root,int min,int max){
        if(root==null)return true;
        if(root.data<min || root.data>=max)return false;
        if(!isBSTHelper(root.left,min,root.data))return false;
        if(!isBSTHelper(root.right,root.data,max))return false;
        return true;
    }
}

//Comparing elements in using inorder traversal(which allows us to compare elements and see if they are in sorted order )
public class Solution
{
    static Node prev = null;
    public static boolean isBST(Node root)
    {
       if(root==null)return true;
       if(!isBST(root.left))return false;
       
      //If elements are not in sorted order than return false
       if(prev!=null && prev.data>root.data){
           return false;
       }
       prev = root;
       
       if(!isBST(root.right))return false;
       return true;
    }
    
}
