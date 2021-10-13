//If I traverse in a post order fashion (ie calling removeLeaves first on child nodes and then removing the leaves of the parent node),
//this will delete all the nodes excepn t the root node
//If I traverse in preorder(ie removing leaves of parent node first and then calling remove leaves on all child nodes),this will give the correct answer.

  public static void removeLeaves(Node node) {
    for(int i=0;i<node.children.size();i++){
        Node child = node.children.get(i);
        if(child.children.size()==0){
            node.children.remove(i);
            i--;
        }
    }
    for(Node child:node.children){
        removeLeaves(child);
    }
    
  }
