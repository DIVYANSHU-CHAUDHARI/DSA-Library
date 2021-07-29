//https://leetcode.com/problems/count-complete-tree-nodes/
//This is postorder traversal

class Solution {
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        return 1+countNodes(root.left) + countNodes(root.right);
        
    }
}
