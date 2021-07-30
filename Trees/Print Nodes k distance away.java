//TC:O(n)
//SC:O(n) // because of path arraylist.
public static void printKNodesFar(Node node, int data, int k) {
    ArrayList<Node> path  = new ArrayList<>();
    nodeToRootPath(node,data,path);
    Node blocker = null;
    for(int i=0;i<path.size();i++){
        Node currNode = path.get(i);
        printKLevelsDown(currNode,k-i,blocker);
        blocker = path.get(i);
    }
    
  }
  public static void printKLevelsDown(Node node,int k,Node blocker){
      if(node==null|| k<0 || node==blocker)return;
      if(k==0){
          System.out.println(node.data);
          return;
      }
      printKLevelsDown(node.left,k-1,blocker);
      printKLevelsDown(node.right,k-1,blocker);
  }
  
  public static boolean nodeToRootPath(Node node,int data,ArrayList<Node> path){
      if(node==null)return false;
      if(node.data == data){
          path.add(node);
          return true;
      }
      boolean res = nodeToRootPath(node.left,data,path) || nodeToRootPath(node.right,data,path);
      if(res){
          path.add(node);
          return true;
      }
      return false;
  }
