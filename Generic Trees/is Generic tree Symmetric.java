//If a tree and its mirror image overlap with each other,than the tree is symmetric
//Instead of passing a new mirror image tree with original tree , 
//I am passing the same tree twice and comparing the left side of the same tree with the right side of the same tree.
//If they overlap,then the tree is symmetric

public static boolean IsSymmetric(Node node) {
    return isMirror(node,node);
  }

 public static boolean isMirror(Node n1,Node n2){
      if(n1.children.size()!=n2.children.size()){
          return false;
      }
      for(int i=0;i<n1.children.size();i++){
          Node child1 = n1.children.get(i);
          Node child2 = n2.children.get(n2.children.size()-1-i);
          if(isMirror(child1,child2)==false){
              return false;
          }
      }
      return true;
  }
