
//max(node) will return the maximum node value in its subtree.
//keeping faith that max(child) will return me the maximum on each of the childrens subtrees and compare it with 
//the nodes value and returning the maximum value out of it
  public static int max(Node node) {
      int maximum = node.data;
      for(Node child:node.children){
            int maxChild = max(child);
            maximum = Math.max(maxChild,maximum);
        }
      return maximum;
  }
