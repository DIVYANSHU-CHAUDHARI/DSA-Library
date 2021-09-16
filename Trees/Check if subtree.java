//Brute force solution
//For every node of T check if S is a subtree.
//TC:O(n^2)
//SC:O(h)


//Optimized solution
//TC:O(n)
//SC:O(h)
class Solution {
    public static boolean isSubtree(Node T, Node S) {
        return traverse(T,S);
        
    }
    
    public static boolean traverse(Node rootT,Node rootS){
        if(rootT==null)return false;
        if(rootT.data == rootS.data){
            if(isSameTree(rootT,rootS)==true)return true;
        }
        if(traverse(rootT.left,rootS)==true)return true;
        if(traverse(rootT.right,rootS)==true)return true;
        return false;
    }
    
    public static boolean isSameTree(Node root1,Node root2){
        if(root1==null && root2 == null)return true;
        if(root1==null || root2==null)return false;
        return root1.data==root2.data && isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right);
    }
}
