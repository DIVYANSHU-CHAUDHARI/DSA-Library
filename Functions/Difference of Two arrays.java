//1.calculating diff = arr[j]-borrow for the current last digit of the greater array and current borrow.
//2.if i>=0 ie if the array1 exists than additionally subtract arr[i]
//3.if Diff<0 then additionally add 10 to the diff.
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    int nSize1 = scn.nextInt();
    int[] n1 = new int[nSize1];
    for(int i=0;i<nSize1;i++){
        n1[i] = scn.nextInt();
    }
    
    int nSize2 = scn.nextInt();
    int[] n2 = new int[nSize2];
    for(int i=0;i<nSize2;i++){
        n2[i] = scn.nextInt();
    }
    
    int[] result = new int[Math.max(n1.length,n2.length)];
    int k = result.length-1;
    int i = n1.length-1;
    int j = n2.length-1;
    int borr = 0;
    int diff;
    while(k>=0){
        diff = n2[j]-borr;
        if(i>=0){
            diff-=n1[i];
        }
        if(diff<0){
            diff+=10;
            borr = 1;
        }else{
            borr = 0;
        }
        result[k] = diff;
        k--;
        i--;
        j--;
     
    }
    k = 0;
  //Skipping zeros
    while(result[k]==0){
        k++;
    }
    while(k<result.length){
        System.out.println(result[k]);
        k++;
    }
 }
}
