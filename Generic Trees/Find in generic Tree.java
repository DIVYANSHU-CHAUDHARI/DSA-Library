public static boolean find(Node node, int data) {
    if(node.data==data)return true;
    for(Node child:node.children){
        if(find(child,data)==true){
            return true;
        }
    }
    return false;
  }
