//https://leetcode.com/problems/binary-tree-inorder-traversal/
//TC:O(N)
//SC:O(LogN)

//Approach1: Making a separate funtion which will populate the inorder traversal and then return the list in the main function.
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        inorderHelper(root,ans);
        return ans;
    }
    public void inorderHelper(TreeNode root,List<Integer> res){
        if(root==null)return;
        inorderHelper(root.left,res);
        res.add(root.val);
        inorderHelper(root.right,res);
    }
}
//Iterative approach
//TC:O(n)
//SC:O(height)
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curr  = root;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }
        return result;
}
}
//Approach2 : Without changing the signature.
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        List<Integer> ans = new ArrayList<Integer>();
        List<Integer> left = inorderTraversal(root.left);
        for(int ele:left)ans.add(ele);
        ans.add(root.val);
        List<Integer> right = inorderTraversal(root.right);
        for(int ele:right)ans.add(ele);
        return ans;
}
}
