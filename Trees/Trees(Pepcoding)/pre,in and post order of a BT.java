  public static void iterativePrePostInTraversal(Node node) {
    String preorder = "";
    String inorder = "";
    String postorder = "";
    
    Pair p = new Pair(node,0);
    Stack<Pair> stk = new Stack<>();
    stk.push(p);
    
    while(!stk.isEmpty()){
        Pair tos = stk.peek();
        if(tos.state==0){
            preorder+=tos.node.data+" ";
            tos.state++;
            if(tos.node.left!=null){
                stk.push(new Pair(tos.node.left,0));
            }
            
        }else if(tos.state==1){
            inorder+=tos.node.data+" ";
            tos.state++;
            if(tos.node.right!=null){
                stk.push(new Pair(tos.node.right,0));
            }
            
        }else{
            postorder+=tos.node.data+" ";
            stk.pop();
        }
    }
    System.out.println(preorder);
    System.out.println(inorder);
    System.out.println(postorder);
  }
