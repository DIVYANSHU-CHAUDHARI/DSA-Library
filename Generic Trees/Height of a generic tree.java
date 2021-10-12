 
//height of a tree = depth of the deepest nodes.

public static int height(Node node) {
      int maxChildHeight = -1;
      for(Node child:node.children){
          maxChildHeight = Math.max(maxChildHeight,height(child));
      }
    return 1 + maxChildHeight;
  }
