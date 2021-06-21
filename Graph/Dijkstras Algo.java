
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        boolean[] finished = new boolean[V];
        int[] distance = new int[V];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[S] = 0;
        for(int count = 0;count<V-1;count++){
            int minV = minDistVertex(finished,distance);
            finished[minV] = true;
            for(int i=0;i<adj.get(minV).size();i++){
                int adjVertex = adj.get(minV).get(i).get(0);
                int adjDistance = adj.get(minV).get(i).get(1);
                if(finished[adjVertex]==false && distance[adjVertex]>distance[minV]+adjDistance){
                     distance[adjVertex] = distance[minV] + adjDistance;
                }
            }
        }
        return distance;
    }
    
    public static int minDistVertex(boolean[] finished,int[] distance){
        int minimum = Integer.MAX_VALUE;
        int min_vertex = 0;
        for(int i=0;i<distance.length;i++){
            if(finished[i]==false && distance[i]<minimum){
                minimum = distance[i];
                min_vertex = i;
            }
        }
        return min_vertex;
    }
}
