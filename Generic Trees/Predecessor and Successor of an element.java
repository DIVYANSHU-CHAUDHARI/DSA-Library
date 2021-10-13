  
  static Node predecessor = null;
  static Node successor;
  static int state = 0;

//State == 0 signifies that the element is not found till now.(Update predecessor till the node value is not equal to the required value.)
//State == 1 says that the next element in preorder traversal is the successor.
//State == 2 means we are done updating the successor and predecessor.

  public static void predecessorAndSuccessor(Node node, int data) {
    if(state == 0){
        if(node.data!=data){
            predecessor = node;
        }else{
            state = 1;
        }
    }else{
        if(state==1){
            successor = node;
            state++;
        }
    }
    for(Node child:node.children){
        predecessorAndSuccessor(child,data);
    }
    
  }
