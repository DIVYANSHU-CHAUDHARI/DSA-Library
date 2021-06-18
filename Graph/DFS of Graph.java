'''
https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1#
'''
#TC:O(V+E)
#SC:O(V)

class Solution
{
    //Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> dfsList = new ArrayList<>();
        dfsHelper(0,visited,adj,dfsList);
        return dfsList;
    }
    public static void dfsHelper(int v,boolean[] visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> dfsList){
        visited[v] = true;
        dfsList.add(v);
        for(int adjacent:adj.get(v)){
            if(visited[adjacent]==false){
                dfsHelper(adjacent,visited,adj,dfsList);
            }
            
        }
    }
    }
