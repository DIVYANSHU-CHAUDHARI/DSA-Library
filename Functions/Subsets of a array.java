-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30	
  
//TC:O(n*2^n)
//1.From the size of the array we can get the [no. of subsets possible = 2^(size-1)]
//2.Convert every no. from 0 to (no.ofSubsets-1) to binary 
//3.For each binary conversion,iterate through the binary no. from left to right.
//4.If the no. is 0 print "-" else if no. is 1 print the corresponding position array element arr[j].

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
    int tns = (int)Math.pow(2,nsize);
    for(int i=0;i<tns;i++){
        int nbool = decToBin(i,nsize);
        int ind = 0;
        int div = (int)Math.pow(10,nsize-1);
        
        for(int j=0;j<nsize;j++){
            int q = nbool/div;
            int rem = nbool%div;
            if(q == 0){
                System.out.print("-\t");
            }else{
                System.out.print(n[j]+"\t");
            }
            nbool=rem;
            div/=10;
        }
        System.out.println();
    }
 }
 public static int decToBin(int n,int size){
       int power = 1;
       int result = 0;
       while(n!=0){
           int rem = n%2;
           result+=(rem*power);
           power*=10;
           n=n/2;
       }
       return result;
 }

}
