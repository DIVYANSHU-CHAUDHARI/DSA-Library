//TC:O(n)
//SC:(1)

class Solution {
    static int canReach(int[] A, int N) {
        int lastGoodPosition = N-1;
        for(int i=N-1;i>=0;i--){
            if(i+A[i]>=lastGoodPosition){
                lastGoodPosition = i;
            }
        }
        
        return (lastGoodPosition==0)?1:0;
    }
};
