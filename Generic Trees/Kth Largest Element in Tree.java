//1st Calculate the 1st largest value by calculating floor value of infinity.
//calculate the 2nd largest value by calculating floor value of first largest.
//and so on.......

public static void flor(Node node,int data){
      if(node.data<data){
          floor = Math.max(floor,node.data);
      }
      for(Node child:node.children){
          flor(child,data);
      }
  }
  public static int kthLargest(Node node, int k){
    int data = Integer.MAX_VALUE;
    floor = Integer.MIN_VALUE;
    for(int i=0;i<k;i++){
        flor(node,data);
        data = floor;
        floor = Integer.MIN_VALUE;
    }
    return data;
  }
