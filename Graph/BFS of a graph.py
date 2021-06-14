  '''
  https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1#
  '''
 
class Solution
{
    //Function to return Breadth First Traversal of given  graph.
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited = new boolean[V];
        Queue<Integer>q = new LinkedList<Integer>();
        //add the source elemenet in queue
        q.add(0);
        //Mark the element as visited
        visited[0] = true;
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(q.size()!=0){
            int u = q.poll();
            arr.add(u);
            //System.out.println(u+"\t");
            for(int v:adj.get(u)){
                if(!visited[v]){
                    visited[v] = true;
                    q.add(v);
                }
            }
            
        }
        return arr;
    }
}
