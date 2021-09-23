//Prateek narang course

public class Practise {
    public static void main(String[] args) {
        Node root = null;
        int[] arr = {8,10,1,6,14,4,7,13};
        for(int x:arr){
            root = insert(root,x);
        }
        Inordertraversal(root);
    }
    public static void Inordertraversal(Node root){
        if(root==null)return;
        Inordertraversal(root.left);
        System.out.print(root.key+", ");
        Inordertraversal(root.right);
    }
    public static Node insert(Node root,int key){
        //Base case when there is no tree or subtree,then create a new node and return
        
        if(root==null)return new Node(key);
        
        //If there is a node,compare its value with root nodes value and accordingly insert into its left or right subtree.assign it to parents 
        //left or right pointers to establish connection.
        
        else{
            if(key<=root.key){
                root.left = insert(root.left,key);
            }else{
                root.right = insert(root.right,key);
            }
        }
        return root;
    }
}
class Node{
    int key;
    Node left;
    Node right;
    public Node(int data){
        key = data;
    }
}

