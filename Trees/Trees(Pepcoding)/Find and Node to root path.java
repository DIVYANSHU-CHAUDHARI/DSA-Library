  public static boolean find(Node node, int data){
    if(node==null)return false;
    if(node.data==data)return true;
    boolean lans = find(node.left,data);
    boolean rans = find(node.right,data);
    boolean ans = lans||rans;
    return ans;
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
        ArrayList<Integer> lans = new ArrayList<>();
        ArrayList<Integer> rans = new ArrayList<>();

        if(node.data==data){
            ArrayList<Integer> result = new ArrayList<>();
            result.add(data);
            return result;
        }

        if(node.left!=null){
            lans = nodeToRootPath(node.left,data);
        }
        if(node.right!=null){
            rans = nodeToRootPath(node.right,data);
        }

        if(lans.size()>0){
            lans.add(node.data);
            return lans;
        }
        if(rans.size()>0){
            rans.add(node.data);
            return rans;
        }
        return new ArrayList<>();
}
