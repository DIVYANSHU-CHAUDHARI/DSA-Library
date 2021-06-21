class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        //To keep track of the distances from vertices currently n mst set to vertices not in the 
        //mst set
        int[] key = new int[V];
        int[] parent = new int[V];
        //True for vertex which is part of MST and False for vertex which is not.
        boolean[] mset = new boolean[V];
        
        //Initialize key values to infinity
        Arrays.fill(key,Integer.MAX_VALUE);
        //We include first vertex(0) in the MST and marke its parent -1.This is the root of the MST  
        key[0] = 0;
        parent[0] = -1;
        
        for(int count=0;count<V-1;count++){
            //Pick up the min distance vertex and return 
            int minV = minVertex(mset,key);
            //Mark the min distance vertex as true meaning it is part of mst
            mset[minV] = true;
            //For all the adjacent vertices of the vertex,update the distances from the newly added vertex in the mst
            for(int i =0;i<adj.get(minV).size();i++){
                int adjVertex = adj.get(minV).get(i).get(0);
                int distToVertex = adj.get(minV).get(i).get(1);
                //We update only when the adjacent vertex is not part of mst and when its distance is less than current distance
                if(mset[adjVertex ]==false && distToVertex<key[adjVertex]){
                    key[adjVertex] = distToVertex;
                    parent[adjVertex] = minV;
                }
            }
    }
    //Return the weight sum of the MST
    int sum = 0;
    for(int i=0;i<key.length;i++){
            sum+=key[i];
        }
    return sum;
}
//This function returns the minm distance vertex from vertices in MST to vertices which are not part of MST
    public static int minVertex(boolean[] mset,int[] key){
        int min = Integer.MAX_VALUE;
        int min_index = 0;
        for(int i=0;i<key.length;i++){
            if(mset[i]==false && key[i]<min){
                min = key[i];
                min_index = i;
            }
        }
        return min_index;
    }
}
