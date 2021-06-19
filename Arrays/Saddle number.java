//https://classroom.pepcoding.com/myClassroom/the-switch-program-3/2d-arrays/saddle-price-official/ojquestion
//The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        int flag = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        //It is necessary to initialize this varialbles,otherwise error
        int row=0,col=0;
        //Outer loop is for rows
        for(int i=0;i<n;i++){
            //Finding minimum number of a row and its column number.column no stored in "col", and min number in "minimum"
            int minimum = Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(arr[i][j]<minimum){
                    minimum = arr[i][j];
                    col = j;
                }
            }
            //Finding maximum number of column "col" and then checking if the minimum equals maximumrn
            //If minimum number == maximum number,we have found the saddle number.
            //Store the row no. as well and finally return arr[row][col]
            int maximum = Integer.MIN_VALUE;
            for(int r=0;r<n;r++){
              if(arr[r][col]>maximum){
                    maximum = arr[r][col];
                    row = r;
                }
              }
            //Break when we found the saddle number
            if(maximum==minimum){
                flag = 1;
                break;
            }
            }
                
        if(flag==1){
            System.out.println(arr[row][col]);
        }else{
            System.out.println("Invalid input");
        }
        }
    }
