//https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1#
//TC:O(n)
//Sc:O(n)

//This code is when the order of nodes at a particular horizontal distance is not important
class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int hd = 0;
        preOrderVertical(hd,map,root);
        for(ArrayList<Integer> list :map.values()){
            for(int x:list){
                result.add(x);
            }
        }
        return result;
    }
    
    public static void preOrderVertical(int hd,TreeMap<Integer,ArrayList<Integer>> map,Node root){
        if(!map.containsKey(hd)){
            map.put(hd,new ArrayList<Integer>());
        }
        map.get(hd).add(root.data);
        if(root.left!=null)preOrderVertical(hd-1,map,root.left);
        if(root.right!=null)preOrderVertical(hd+1,map,root.right);
    }
}

//When the order of nodes at a particular HD is important.ie the nodes should be printed in level order fashion.
//https://www.youtube.com/watch?v=LscPXvD1N1A

class Pair{
    int hd;
    int val;
    Node n;
    public Pair(int val,int hd,Node n){
        this.hd =  hd;
        this.val = val;
        this.n = n;
    }
}

class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(new Pair(root.data,0,root));
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                 Pair node = queue.remove();
                 int hd = node.hd;
                 if(!map.containsKey(node.hd)){
                     map.put(hd,new ArrayList<Integer>());
                     }
                map.get(hd).add(node.val);
                if(node.n.left!=null){
                    queue.add(new Pair(node.n.left.data,hd-1,node.n.left));
                }
                if(node.n.right!=null){
                    queue.add(new Pair(node.n.right.data,hd+1,node.n.right));
                }
            
            }
            
        }
        for(ArrayList<Integer> list :map.values()){
            for(int x:list){
                result.add(x);
            }
        }
        
        return result;
    }
}
