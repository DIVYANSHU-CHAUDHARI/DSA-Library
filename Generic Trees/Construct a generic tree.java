import java.util.*;

public class Solution{
    public static class Node{
        int data;
        ArrayList<Node> children;

        public Node(){
            children  = new ArrayList<Node>();
        }
    }
    public static Node construct(int[] arr){
        Node rootNode = new Node();
        rootNode.data = arr[0];
        Stack<Node> stack = new Stack<Node>();
        stack.push(rootNode);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=-1) {
                Node node = new Node();
                node.data = arr[i];
                Node topNode = stack.peek();
                topNode.children.add(node);
                stack.push(node);

            }else{
                stack.pop();
            }
        }
        return rootNode;
    }
    public static void display(Node node){
        System.out.print(node.data+" ");
        for(Node children:node.children){
            display(children);
        }
    }
    public static void main(String[] args) {
        
        //preorder traversal of the tree is given
        //-1 indicates that there is no node present.
        
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = construct(arr);
        display(root);
    }
    }
