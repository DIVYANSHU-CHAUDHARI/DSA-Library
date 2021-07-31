//Given a tree were each leaf to root path represents a number, and we were supposed to return the sum of all the numbers that were 
//formed int the tree

class Solution {
    public int sumNumbers(TreeNode root) {
        return (int)sumNodes(root,0,0);
    }
    public double sumNodes(TreeNode root,double val,int height){
        if(root==null)return 0;
        double currSum = root.val*Math.pow(10,height)+val;
        if(root.left==null && root.right==null)return currSum;
        double leftSum = sumNodes(root.left,currSum,height+1);
        double rightSum = sumNodes(root.right,currSum,height+1);
        return leftSum+rightSum;        
    }
}
