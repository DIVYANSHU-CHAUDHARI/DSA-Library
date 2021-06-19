  """
  https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1#
  """
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = scn.nextInt();
            }
        }
    //Spiral Code starts from here
        int rmin = 0;
        int rmax = rows-1;
        int cmin = 0;
        int cmax = cols-1;
        int tne = rows*cols;
        int count = 0;
        while(count<tne){
            for(int row=rmin;row<=rmax && count<tne;row++){
                System.out.println(matrix[row][cmin]);
                count++;
            }
            //First column is printed and therefore I can increment first column by 1.SImilarly for others
            cmin++;
            for(int col=cmin;col<=cmax && count<tne;col++){
                System.out.println(matrix[rmax][col]);
                count++;
            }
            rmax--;
            for(int row=rmax;row>=rmin && count<tne;row--){
                System.out.println(matrix[row][cmax]);
                count++;
            }
            cmax--;
            for(int col=cmax;col>=cmin && count<tne;col--){
                System.out.println(matrix[rmin][col]);
                count++;
            }
            rmin++;
            
        }
    }

}
