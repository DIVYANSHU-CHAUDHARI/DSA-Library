 
public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    if(node.data==data){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(data);
        return result;
    }
    for(Node child:node.children){
        ArrayList<Integer> arr = nodeToRootPath(child,data);
      //arr size being 0 signifies that data node is not present in its subtree
        if(arr.size()>0){
            arr.add(node.data);
            return arr;
        }
    }
    return new ArrayList<>();
 }
