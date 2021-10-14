//USe faith method in all of them

public static int size(Node node){
      if(node==null)return 0;
      
      int lans = size(node.left);
      int rans = size(node.right);
      int ans = lans+rans+1;
      
    return ans; 
  }

  public static int sum(Node node) {
    if(node==null)return 0;
    int lans = sum(node.left);
    int rans = sum(node.right);
    int ans = node.data+lans+rans;
    return ans;
  }

  public static int max(Node node) {
    if(node==null)return Integer.MIN_VALUE;
    int lans = max(node.left);
    int rans = max(node.right);
    int ans = Math.max(node.data,Math.max(lans,rans));
    return ans;
  }

//Here,height is in terms of edges
  public static int height(Node node) {
    if(node==null)return -1;
    int lans = height(node.left);
    int rans = height(node.right);
    int ans = Math.max(lans,rans)+1;
    return ans;
  }
