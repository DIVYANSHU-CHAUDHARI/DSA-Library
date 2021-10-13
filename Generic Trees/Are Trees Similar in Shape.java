  
public static boolean areSimilar(Node n1, Node n2) {
    if(n1.children.size()!=n2.children.size())return false;
  
  //If any of the two nodes children are not similar,return false and dont check for similarity for any further nodes.
    for(int i=0;i<n1.children.size()-1;i++){
        Node child1 = n1.children.get(i);
        Node child2 = n2.children.get(i);
        if(areSimilar(child1,child2)==false){
            return false;
        }
    }
  
  //Return true if all children nodes of both the root nodes are similar
    return true;
  }
