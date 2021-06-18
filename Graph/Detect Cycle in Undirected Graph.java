  '''
  https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1/#
  '''
  #TC:O(V+E)
  #SC:O(V)
	  
class Solution
{
    //Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited= new boolean[adj.size()];
	    
        // Call the recursive helper 
        // function to detect cycle in different
        // DFS trees
        for(int v =0;v<adj.size();v++){
            if(visited[v]==false){
                if(Dfs(v,adj,visited,-1) == true){
                    return true;
                }
            }
        }
        return false;
    }
    boolean Dfs(int vertex,ArrayList<ArrayList<Integer>> adj,boolean[] visited,int parent){
        visited[vertex] = true;
        for(int neighbor:adj.get(vertex)){
            if(visited[neighbor]==false){
                //If any of its neighbors returns true.then the parent dfs call should also return true;
                if(Dfs(neighbor,adj,visited,vertex)==true){
                    return true;
                };
            }
            else{
	    //If an adjacent vertex is 
            // visited and not parent 
            // of current vertex,
            // then there is a cycle
                if(parent!=neighbor){
                    return true;
                }
            }
        }
        return false;
    }
}
