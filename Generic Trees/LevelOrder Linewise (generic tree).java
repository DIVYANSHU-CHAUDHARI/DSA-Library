//You are required to complete the body of levelorderLineWise function. 
//The function is expected to visit every node in "levelorder fashion" and print them from left to right (level by level). 
//All nodes on same level should be separated by a space. 
//Different levels should be on separate lines. Please check the question video for more details.

public static void levelOrderLinewise(Node node){
    Queue<Node> q1 = new ArrayDeque<>();
    Queue<Node> q2 = new ArrayDeque<>();
    q1.add(node);
    
    while(!q1.isEmpty()){
        int size = q1.size();
        for(int i=0;i<size;i++){
            Node n = q1.remove();
            System.out.print(n.data+ " ");
            for(Node child:n.children){
                q2.add(child);
            }
        }
        System.out.println();
        q1 = q2;
        q2 = new ArrayDeque<>();
    }
  }
