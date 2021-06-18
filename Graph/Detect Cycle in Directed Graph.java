'''
https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1#
'''
//TC:O(V+E)
//SC:O(V)

class Solution 
{
    //Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
      //To keep track of all the recursive calls 
        boolean[] recSt =  new boolean[V];
        boolean[] visited = new boolean[V];
       //If there are any components that are not connected,we need this for loop
        for(int v=0;v<V;v++){
            if(visited[v]==false){
                if(dfs(v,visited,recSt,adj)==true){
                    return true;
                }
            }
        }
        return false;
    }
    //Returns True if there is any cycle detected.Else,False   
    boolean dfs(int v,boolean[] visited,boolean[] recSt,ArrayList<ArrayList<Integer>> adj){
        visited[v]=true;
        recSt[v] = true;
        for(int adjacent:adj.get(v)){
            if(visited[adjacent]==false){
                if(dfs(adjacent,visited,recSt,adj)==true){
                    return true;
                }
            }
            else{
               //If any adjacent node of a node is already visited and is in the recursion stack
               //That means it is the ancestor of the current node and therfore a back edge is detected.
               //Which means we have detected our cycle
                if(recSt[adjacent]==true){
                    return true;
                }
            }
            
        }
        //We pull of the Node which is explored from the recursion stack.
        recSt[v] = false;
        //Returning False if no cycle detected
        return false;
    }
}
