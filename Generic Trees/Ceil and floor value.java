
  static int ceil = Math.MAX_VALUE;
  static int floor = Math.MIN_VALUE;
  public static void ceilAndFloor(Node node, int data) {
    if(node.data>data){
        ceil = Math.min(ceil,node.data);
    }else if(node.data<data){
        floor = Math.max(floor,node.data);
    }
    for(Node child:node.children){
        ceilAndFloor(child,data);
    }
  }
