class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null)return result;
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            result.add(node.data);
            
            if(node.right!=null)stack.add(node.right);
            if(node.left!=null)stack.add(node.left);
        }
        return result;
    }
    
    
}
