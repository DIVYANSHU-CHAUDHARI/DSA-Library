  public static void printKNodesFar(Node node, int data, int k) {
    ArrayList<Node> pathFromNodeToRoot = nodeToRoot(node,data);
    Node blockNode = null;
    for(int i=0;i<pathFromNodeToRoot.size();i++){
        Node n = pathFromNodeToRoot.get(i);
        printKLevelsDown(n,k,blockNode);
        blockNode = n;
        k--;
    }
    
  }

  public static void printKLevelsDown(Node node,int k,Node blockNode){
      if(node==null || node==blockNode)return;
      if(k==0){
          System.out.println(node.data);
          return;
      }
      printKLevelsDown(node.left,k-1,blockNode);
      printKLevelsDown(node.right,k-1,blockNode);
  }

  public static ArrayList<Node> nodeToRoot(Node node,int data){
      if(node==null)return new ArrayList<>();
      if(data==node.data){
          ArrayList<Node> result = new ArrayList<>();
          result.add(node);
          return result;
      }
     
      ArrayList<Node> lans = nodeToRoot(node.left,data);
      ArrayList<Node> rans = nodeToRoot(node.right,data);
      if(lans.size()>0){
          lans.add(node);
          return lans;
      }
      if(rans.size()>0){
          rans.add(node);
          return rans;
      }
      return new ArrayList<>();
      
  }
