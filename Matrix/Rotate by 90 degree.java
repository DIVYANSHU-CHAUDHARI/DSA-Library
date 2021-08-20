//TC:O(n*n)
//SC:O(1)

class GFG
{
    static void rotate(int matrix[][]) 
    {
        //Trnaspose matrix in-place
        for(int i =0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int  top = 0;
        int  bottom = matrix.length-1;
        
        //Swap first row with last row
        //Second row with secondlast row......
        while(top<bottom){
            for(int j=0;j<matrix[0].length;j++){
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
            }
            top++;
            bottom--;
        }
    }
}
