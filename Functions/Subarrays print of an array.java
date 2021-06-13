//1.Fix the first element
//2.Print all the subarrays starting from that element using indices j and k respectively.
//3.Increment and fix next element and repeat step 2 till the end of the array.
//4.No. of subarrays in an array are sum of first n naturnal nos where nisthe size of the array or n*(n+1)/2
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int nsize = scn.nextInt();
    int[] n = new int[nsize];
    for(int i=0;i<nsize;i++){
        n[i] = scn.nextInt();
    }

    for(int i=0;i<nsize;i++){
        for(int j=i;j<nsize;j++){
            for(int k=i;k<=j;k++){
                System.out.print(n[k]+"\t");
            }
            System.out.println();
        }
    }    
 }

}
