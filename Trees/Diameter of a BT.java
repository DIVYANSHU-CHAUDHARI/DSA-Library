  #TC:O(n)
  #SC:O(height)
    
  #Function to return the diameter of a Binary Tree.
  class Solution {
    // Function to return the diameter of a Binary Tree.
    static int maxLength = Integer.MIN_VALUE;
    int diameter(Node root) {
        diameterHelper(root);
        //System.out.println(maxLength);
        return maxLength;
    }
    int diameterHelper(Node root){
        if(root==null)return 0;
        int lh = diameterHelper(root.left);
        int rh = diameterHelper(root.right);
        maxLength = Math.max(maxLength,1+lh+rh);
        //System.out.println(maxLength);
        return 1 + Math.max(lh,rh);
    }
}
