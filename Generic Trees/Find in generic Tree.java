public static boolean find(Node node, int data) {
    if(node.data==data)return true;
    //As soon as I find the data in any of its child nodes subtrees,I return true 
    //and not check for the other remaining child node subtrees.
    
    for(Node child:node.children){
        if(find(child,data)==true){
            return true;
        }
    }
    return false;
  }
