
public static Node getTail(Node node){
      while(node.children.size()!=0){
          node = node.children.get(0);
      }
      return node;
  }
  
  public static void linearize(Node node){
    for(Node child:node.children){
        linearize(child);
    }
    //[20k,30k,40k]
    //Take the tail of second last list (tail of 30k list ) and point the tail of it to 40k
    //remove 40k list
    //[20k,30k]
    //Take the tail of second last list (tail of 20k list ) and point the tail of it to 30k
    //remove 30k list
    //[20k]
    //Repeat these steps till there is only one element left in the parent nodes children
    
    while(node.children.size()>0){
        Node slChainKiTail = getTail(node.children.get(node.children.size()-2));
        slChainKiTail.children.add(node.children.get(node.children.size()-1));
        node.children.remove(node.children.size()-1);
    }
    
  }
