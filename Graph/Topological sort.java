    '''
    https://practice.geeksforgeeks.org/problems/topological-sort/1#
    '''
//Algo:
/*
Algorithm: Steps involved in finding the topological ordering of a DAG:
Step-1: Compute in-degree (number of incoming edges) for each of the vertex present in the DAG and initialize the count of visited nodes as 0.

Step-2: Pick all the vertices with in-degree as 0 and add them into a queue (Enqueue operation)

Step-3: Remove a vertex from the queue (Dequeue operation) and then.
Increment count of visited nodes by 1.
Decrease in-degree by 1 for all its neighboring nodes.
If in-degree of a neighboring nodes is reduced to zero, then add it to the queue.
Step 5: Repeat Step 3 until the queue is empty.
Step 6: If count of visited nodes is not equal to the number of nodes in the graph then the topological sort is not possible for the given graph.
*/
  #TC:O(V+E)
    #SC:O(V)
    #Function to return list containing vertices in Topological order.
    
class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        Queue<Integer> q = new LinkedList<Integer>();
        int[] indegrees = new int[V];
        ArrayList<Integer> topOrder = new ArrayList<>();
        
        int noOfNodes = 0;
        
        for(int v=0;v<adj.size();v++){
            for(int adjacent:adj.get(v)){
                indegrees[adjacent]+=1;
            }
        }
        
        for(int i=0;i<V;i++){
                if(indegrees[i]==0){
                    q.add(i);
                }
            }
        while(!q.isEmpty()){
            
            int vertex = q.poll();
            topOrder.add(vertex);
            noOfNodes++;
            for(int adjacent:adj.get(vertex)){
                if(--indegrees[adjacent]==0){
                    q.add(adjacent);
                    }
                }
            }
        
    int[] arr = new int[topOrder.size()];
    for(int i=0;i<arr.length;i++){
        arr[i] = topOrder.get(i);
    }
    return arr;
    }
}
