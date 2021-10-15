//TC: O(height)
public static boolean find(Node node,int data){
  
  if(node==null)return false;
  if(node.data==data){
    return true;
  }else if(node.data<data){
    return find(node.right,data);
  }else{
    return find(node.left,data);
  }
}
