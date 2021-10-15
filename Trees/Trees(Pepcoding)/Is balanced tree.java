  public static int isBalanced(Node node){
      if(node==null)return 0;
      int lans = isBalanced(node.left);
      int rans = isBalanced(node.right);
      if(lans==-1 || rans == -1)return -1;
      if(Math.abs(lans-rans)>1)return -1;
      return Math.max(lans,rans)+1;
  }
