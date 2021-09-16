 #Recursive apprach
//return true/false if the is Symmetric or not
class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        return isSymmetricHelper(root,root);
    }
    
    public static boolean isSymmetricHelper(Node root1,Node root2){
        if(root1==null && root2==null)return true;
        if(root1==null || root2==null)return false;
        return root1.data==root2.data && isSymmetricHelper(root1.left,root2.right)&& isSymmetricHelper(root1.right,root2.left);
    }
}
  ###################################################
  
  #Iterative approach
  
class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        if(root==null)return true;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()){
            Node temp_left  = q.remove();
            Node temp_right = q.remove();
            if(temp_left==null && temp_right==null)continue;
            if(temp_left==null || temp_right==null)return false;
            if(temp_left.data!=temp_right.data)return false;
            q.add(temp_left.left);
            q.add(temp_right.right);
            q.add(temp_left.right);
            q.add(temp_right.left);
        }
        return true;
    }
    
    
}
                     
