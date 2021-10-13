//maxSum will eventually contain the maximum sum of a subtree from all subtrees in the tree
//maxNode will contain the corresponding node 

  static int maxSum = Integer.MIN_VALUE;
  static Node maxNode = null;
  public static int MaxSubSum(Node node){
      int sum = node.data;
      for(Node child:node.children){
          sum+=MaxSubSum(child);
      }
      if(sum>maxSum){
          maxSum = sum;
          maxNode = node;
      }
      return sum;
  } 


//called the below lines in main function
MaxSubSum(root);
System.out.println(maxNode.data+"@"+maxSum);
