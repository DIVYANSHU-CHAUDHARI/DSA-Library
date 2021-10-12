  
public static void levelOrder(Node node){
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    while(!q.isEmpty()){
        int size = q.size();
        for(int i=0;i<size;i++){
            Node n = q.remove();
            System.out.print(n.data+" ");
            for(Node child:n.children){
                q.add(child);
            }
        }
    }
    System.out.print(".");
  }
