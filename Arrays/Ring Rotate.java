import java.io.*;
import java.util.*;
//Three main steps
//Step1.Take out the given ring(specified by the shell no. s) from the matrix and fill it into a 1D array.
//Step2.Rotate the 1D array by the required amount(given by r).
//Step3.Fill the rotated array exactly into positions of the matrix it was taken off from.
//You get the new rotated shell matrix.
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();
        
        shellRotate(arr,s,r);
        display(arr);
    }
    public static void shellRotate(int[][] arr,int s,int r){
        int[] la = fill1Dfrom2D(arr,s);
        rotate1D(la,r);
        fill2Dfrom1D(arr,s,la);
    }
    public static int[] fill1Dfrom2D(int[][] arr,int s){
        int rmin = s-1;
        int cmin = s-1;
        int rmax = arr.length-s;
        int cmax = arr[0].length-s;
        int[] la = new int[2*(rmax-rmin)+2*(cmax-cmin)];
        int idx = 0;
        
        for(int row=rmin;row<=rmax;row++){
            la[idx]=arr[row][cmin];
            idx++;
        }
        cmin++;
        for(int col=cmin;col<=cmax;col++){
            la[idx]=arr[rmax][col];
            idx++;
        }
        rmax--;
        for(int row=rmax;row>=rmin;row--){
            
            la[idx]=arr[row][cmax];
            idx++;
        }
        cmax--;
        for(int col=cmax;col>=cmin;col--){
            la[idx]=arr[rmin][col];
            idx++;
        }
        rmin++;
        
        return la;
    }
    public static void fill2Dfrom1D(int[][] arr,int s,int[] la){
        int rmin = s-1;
        int cmin = s-1;
        int rmax = arr.length-s;
        int cmax = arr[0].length-s;
        int idx = 0;
        
        for(int row=rmin;row<=rmax;row++){
            arr[row][cmin] = la[idx];
            idx++;
        }
        cmin++;
        for(int col=cmin;col<=cmax;col++){
            arr[rmax][col] = la[idx];
            idx++;
        }
        rmax--;
        for(int row=rmax;row>=rmin;row--){
            arr[row][cmax]=la[idx];
            idx++;
        }
        cmax--;
        for(int col=cmax;col>=cmin;col--){
            arr[rmin][col]=la[idx];
            idx++;
        }
        rmin++;
   
    }
    public static void rotate1D(int[] la,int k){
        k = k%la.length;
        if(k<0){
            k+=la.length;
        }
        reverse(la,0,la.length-1);
        reverse(la,0,k-1);
        reverse(la,k,la.length-1);
        
    }
    public static void reverse(int[] la,int left,int right){

        while(left<right){
            int temp = la[left];
            la[left] = la[right];
            la[right] = temp;
            left++;
            right--;
        }
        
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
