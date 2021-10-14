package com.company;
import java.util.*;

    class Node{
        Integer data;
        Node left;
        Node right;
        //default constructor
        public Node(){
            left = null;
            right = null;
        }
        //parameterized constructor
        public Node(Integer data,Node left,Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    class Pair{
        Node node;
        int state;
        public Pair(Node node,int state){
            this.node = node;
            this.state = state;
        }
    }
public class BinaryTree {
    public static void main(String[] args) {
      //Inorder traversal of BT
      
        Integer[] arr = {10,20,40,null,80,null,null,50,null,null,30,null,60,70,null,null,null};
        Node root = construct(arr);
        display(root);
    }
  
  //If top of stack node state is 0,then incoming node should be pointed to left child of tos.
  //If top of stack node state is 1,then incoming node should be pointed to right child of tos.
  //If top of stack node state is 2,then run while loop and pop all those nodes whose states are 2.
  
  //After following any of the above three steps,push the incoming node into the stack with state as 0.
  
    public static Node construct(Integer[] arr){
        Node root = new Node(arr[0],null,null);
        Stack<Pair> stk = new Stack<>();
        stk.push(new Pair(root,0));
        for(int i=1;i<arr.length;i++){
            Integer val = arr[i];
            Node node = null;
            if(arr[i]!=null){
                node = new Node(val,null,null);
            }
            Pair tos = stk.peek();
            if(tos.state==0){
                tos.node.left = node;
                tos.state++;
            }else if(tos.state==1){
                tos.node.right = node;
                tos.state++;
            }
            while(stk.size()>1 && tos.state==2){
                stk.pop();
                tos = stk.peek();
            }
            if(node!=null){
                stk.push(new Pair(node,0));
            }

        }
        return root;
    }
    public static void display(Node root){
        if(root==null)return;
        String l=".";
        String r= ".";
        if(root.left!=null){
            l = Integer.toString(root.left.data);
        }

        if(root.right!=null){
            r = Integer.toString(root.right.data);
        }

        System.out.println(l + "<- " + root.data + " ->" + r);
        display(root.left);
        display(root.right);
    }
}
