//https://practice.geeksforgeeks.org/problems/construct-tree-1/1#
//FAANG solution

//Not passing all testcases on Leetcode & gfg.
class Solution
{
    private static int index = 0;
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        return buildTreeHelper(inorder,preorder,0,n-1);
        
    }
    
    public static Node buildTreeHelper(int[] inorder,int[] preorder,int s,int e){
        //Base case 
        if(s>e){
            return null;
        }
        int data = preorder[index];
        index++;
        Node root = new Node(data);
        int idx = -1;
        for(int i = s;i<=e;i++){
            if(data==inorder[i]){
                idx = i;
                break;
            }
        }
        root.left = buildTreeHelper(inorder,preorder,s,idx-1);
        root.right = buildTreeHelper(inorder,preorder,idx+1,e);
        return root;
    }
}
