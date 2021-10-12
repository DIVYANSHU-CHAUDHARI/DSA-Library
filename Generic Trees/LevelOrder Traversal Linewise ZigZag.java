  
public static void levelOrderLinewiseZZ(Node node){
    Stack<Node> s1 = new Stack<>();
    Stack<Node> s2 = new Stack<>();
    s1.add(node);
    int level = 0;
    while(!s1.isEmpty()){
        int size = s1.size();
        for(int i=0;i<size;i++){
            Node n = s1.pop();
            System.out.print(n.data+" ");
            if(level%2==0){
                 for(Node child:n.children){
                     s2.push(child);
                 }
            }else{
                for(int j=n.children.size()-1;j>=0;j--){
                    s2.push(n.children.get(j));
                }
            }
        }
        System.out.println();
        level++;
        s1 = s2;
        s2 = new Stack<>();
    }
  }
