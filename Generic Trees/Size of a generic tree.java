//Summ up size of all the children nodes and add 1 to it to calculate the size of a generic tree
//TC:(n) where n is the no. of nodes

public static int size(Node node){
        int childrenSize = 0;
        for(Node child:node.children){
            childrenSize += size(child);
        }
       return 1 + childrenSize; 
  }
