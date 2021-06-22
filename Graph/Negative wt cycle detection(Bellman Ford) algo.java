//https://practice.geeksforgeeks.org/problems/negative-weight-cycle3504/1#
//Returning distances array will result into bellmanford algo.
//TC:O(VE)=O(V^2)  minimum if , no.of edges = no. of vertices
//TC:O(V^3) as for complete graph , no. of edges = O(V^2)
//SC:O(V)
class Solution
{
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
        int[] distances = new int[n];
        Arrays.fill(distances,Integer.MAX_VALUE);
        distances[0] = 0;
        for(int count=0;count<n-1;count++){
            for(int i =0;i<edges.length;i++){
                //distances[u]!=Integer.MAX_VALUE is really important 
                //If not done,this could lead to updation of negative values into distances[v],considering directed edge
                //from u to v with some weight
                if(distances[edges[i][0]]!=Integer.MAX_VALUE && distances[edges[i][1]]>distances[edges[i][0]]+edges[i][2]){
                    distances[edges[i][1]]=distances[edges[i][0]]+edges[i][2];
                }
            }
        }
        for(int i =0;i<edges.length;i++){
                if(distances[edges[i][0]]!=Integer.MAX_VALUE && distances[edges[i][1]]>distances[edges[i][0]]+edges[i][2]){
                    return 1;
               }
        }
        return 0;
    }
}
