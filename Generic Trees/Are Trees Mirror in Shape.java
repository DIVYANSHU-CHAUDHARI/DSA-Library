  
public static boolean areMirror(Node n1, Node n2) {
    if(n1.children.size()!=n2.children.size())return false;
    for(int i=0;i<n1.children.size();i++){
        Node child1 = n1.children.get(i);
      
      //Comparing the first child node of first root node to the last child node of the second root node and the 2nd with 2nd last and so on...
      //If any of the children nodes are not mirror we immediately return false 
      
        Node child2 = n2.children.get(n2.children.size()-1-i);
        if(areMirror(child1,child2)==false){
            return false;
        }
    }
    return true;
  }
