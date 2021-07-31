//https://leetcode.com/problems/sum-root-to-leaf-numbers/
//TC:O(n)
//https://www.youtube.com/watch?v=Gi0202QawRQ

class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNodes(root,0);
    }
    public int sumNodes(TreeNode root,int val){
        if(root==null)return 0;
        int currSum = root.val+val*10;
        if(root.left==null && root.right==null)return currSum;
        int leftSum = sumNodes(root.left,currSum);
        int rightSum = sumNodes(root.right,currSum);
        return leftSum+rightSum;        
    }
}
