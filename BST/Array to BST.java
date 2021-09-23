//https://practice.geeksforgeeks.org/problems/array-to-bst4443/1#

class Node{
    int data; 
    Node left = null;
    Node right = null;
    Node(int data){
        this.data = data;
    }
}
class Solution
{
    public int[] sortedArrayToBST(int[] nums)
    {
        Node root = createBST(nums,0,nums.length-1);
        ArrayList<Integer> arr = new ArrayList<>();
        traversal(root,arr);
        int[] ans = new int[nums.length];
        for(int i = 0;i<ans.length;i++)ans[i] = arr.get(i);
        return ans;
    }
    
    public static Node createBST(int[] nums,int left,int right){
        if(left>right) return null;
        int mid = left + (right-left)/2;
        Node node = new Node(nums[mid]);
        node.left = createBST(nums,left,mid-1);
        node.right = createBST(nums,mid+1,right);
        return node;
    }
    
    public static void traversal(Node root,ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        arr.add(root.data);
        traversal(root.left,arr);
        traversal(root.right,arr);
    }
}
