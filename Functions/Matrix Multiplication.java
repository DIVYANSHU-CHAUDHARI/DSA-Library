import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    //Matrix 1 input
    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int[][] arr1 = new int[n1][m1];
    for(int i=0;i<n1;i++){
        for(int j=0;j<m1;j++){
            arr1[i][j] = scn.nextInt();
        }
    }
    //Matrix 2 input
    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int[][] arr2 = new int[n2][m2];
    for(int i=0;i<n2;i++){
        for(int j=0;j<m2;j++){
            arr2[i][j] = scn.nextInt();
        }
    }
    //If multiplication is possible
    //Result matrix is n1xm2 dimensions.Fill this matrix using nested loops.
    if(m1==n2){
        int cd = m1;
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                int sum = 0;
                for(int k=0;k<cd;k++){
                    sum+=arr1[i][k] * arr2[k][j];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }else{
        System.out.println("Invalid input");
    }
    
 }

}
