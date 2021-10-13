 public static void mirror(Node node){
     //keep faith that the childrens will create a mirror image of themselves.
     //Reverse the nodes in the childrens list of the parent node to get the mirror image of the parent node.
     //mirror image of a node with its childrens will be the reverse order of its children in its childrens list.
     
    for(Node child:node.children){
        mirror(child);
    }
    int left = 0;
    int right = node.children.size()-1;
    while(left<right){
        Node temp = node.children.get(left);
        node.children.set(left,node.children.get(right));
        node.children.set(right,temp);
        left++; 
        right--;
    }
  }
