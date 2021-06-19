//TC:O(n+m) where n- no. of rows and m- no. of columns.
//while(i>=0 and j<arr[0].length)
//1.Start from the bottom left corner.i=arr.length-1,j=0
//2.if the current element is greater than target move upwards by 1 .i--
//3.if the current element is smaller than target move downwards by 1 . j++
//4.If the current cell element is equal to the target we have found the target.return.
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
        int data = scn.nextInt();
        int i = arr.length-1;
        int j = 0;
        
        while(i>=0 && j<arr[0].length){
            if(arr[i][j]==data){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(arr[i][j]>data){
                i--;
            }else{
                j++;
            }
        }
        System.out.println("Not Found");
    }

}
