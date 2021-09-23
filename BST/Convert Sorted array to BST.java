//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)return null;
        return ArraytoBSTHelper(nums,0,nums.length-1);
    }
    public static TreeNode ArraytoBSTHelper(int[] nums,int left,int right){
        if(left>right)return null;
        int mid = left + (right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = ArraytoBSTHelper(nums,left,mid-1);
        node.right = ArraytoBSTHelper(nums,mid+1,right);
        return node;
    }
}
