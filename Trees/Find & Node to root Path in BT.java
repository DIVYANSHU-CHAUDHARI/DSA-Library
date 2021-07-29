//Finding if a particular node is present or not in the tree 
public static boolean find(Node node, int data){
      if(node==null)return false;
      if(node.data==data){
          return true;
      }
      return find(node.left,data) || find(node.right,data); 
  }



//Finding node to root path of a particlar node(if present) in a BT.

  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        nodeToRootPathHelper(node,data,ans);
        return ans;
  }
  public static boolean nodeToRootPathHelper(Node node, int data,ArrayList<Integer> ans){
      if(node==null)return false;
      if(node.data==data){
          ans.add(data);
          return true;
      }
      boolean res = nodeToRootPathHelper(node.left,data,ans) || nodeToRootPathHelper(node.right,data,ans);
      if(res)ans.add(node.data);
      return res;
      
  }
