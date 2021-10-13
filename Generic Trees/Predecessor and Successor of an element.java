  
  static Node predecessor = null;
  static Node successor;
  static int state = 0;

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
