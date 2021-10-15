 public static boolean isBST(Node node,int min,int max){
     if(node==null)return true;
     if(node.data<=min || node.data>max)return false;
     if(isBST(node.left,min,node.data)==false)return false;
     if(isBST(node.right,node.data,max)==false)return false;
     return true;
     
 }
