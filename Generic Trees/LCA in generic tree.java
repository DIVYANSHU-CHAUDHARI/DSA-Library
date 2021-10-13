  
  public static int lca(Node node, int d1, int d2) {
    ArrayList<Integer> l1 = nodeToRootPath(node,d1);
    ArrayList<Integer> l2 = nodeToRootPath(node,d2);
    int i = l1.size()-1;
    int j = l2.size()-1;
    while(i>=0 && j>=0){
        if(l1.get(i)!=l2.get(j)){
            break;
        }
        i--;
        j--;
    }
    return l1.get(i+1);
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
    if (node.data == data) {
      ArrayList<Integer> path = new ArrayList<>();
      path.add(node.data);
      return path;
    }

    for (Node child : node.children) {
      ArrayList<Integer> ptc = nodeToRootPath(child, data);
      if (ptc.size() > 0) {
        ptc.add(node.data);
        return ptc;
      }
    }

    return new ArrayList<>();
  }
