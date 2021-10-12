//https://practice.geeksforgeeks.org/problems/boolean-matrix-problem-1587115620/1#
//TC:O(n*m)
//SC:O(1)

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 1){
                    matrix[i][0] = 1;
                    matrix[0][j] = 1;
                }
            }
        }
      
      //Skip the top left corner out of the search space for the two loops below
      
        for(int j=1;j<matrix[0].length;j++){
            if(matrix[0][j]==1){
                for(int k=0;k<matrix.length;k++){
                    matrix[k][j] = 1;
                }
            }
        }
      
         for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==1){
                for(int k=0;k<matrix[0].length;k++){
                    matrix[i][k] = 1;
                }
            }
        }
        if(matrix[0][0]==1){
            for(int k=0;k<matrix.length;k++){
                    matrix[k][0] = 1;
                }
            for(int k=0;k<matrix[0].length;k++){
                    matrix[0][k] = 1;
                }
        }
        
    }
}
