//https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1#
//TC:O(n) where n are the no. of nodes
//SC = O(logn)
class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}*/

class Solution{
    public void toSumTree(Node root){
         toSumTreeHelper(root);
    }
    public int toSumTreeHelper(Node root){
         if(root==null)return 0;
         int leftSum = toSumTreeHelper(root.left);
         int rightSum = toSumTreeHelper(root.right);
         int rootVal = root.data;
         root.data = leftSum + rightSum;
         return rootVal+root.data;
    }
}
