//TC:O(n^2) if th tree is skewed
//SC:O(height)
//Function to check whether a binary tree is balanced or not.
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int lnh = height(root.left);
        int rnh = height(root.right);
        return (Math.abs(lnh-rnh)<=1 && isBalanced(root.left) && isBalanced(root.right));
        
    }
    
    public static int height(TreeNode root){
        if(root==null)return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
}
//Approach2:TC:O(n)
//isBalancedHelper(root)==-1 indicate there is a node in this tree which is unbalanced
//if isBalancedHelper(root)!=-1 ,isBalancedHelper(root) returns the height of the root node which also indicates that the tree with root node is balanced
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(isBalancedHelper(root)!=-1){
            return true;
        }
        return false;   
    }
    public int isBalancedHelper(TreeNode root){
        if(root==null)return 0;
        int lh = isBalancedHelper(root.left);
        if(lh==-1)return -1;
        int rh = isBalancedHelper(root.right);
        if(rh==-1)return -1;
        if(Math.abs(lh-rh)>1)return -1;
        return Math.max(lh,rh)+1;
    }
}
