//1.Iterate from the end of two arrays keeping the indexing such that we donot get indexOutOfBound error.
//2.Simultaneously iterate over the final array and fill digit by digit from the end.
//3.When any array gets exhausted as it is smaller than the there we dnt add its elements by using if loop accorsingly.
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    int n1Size = scn.nextInt();
    int[] n1 = new int[n1Size];
    for(int i =0;i<n1Size;i++){
        n1[i] = scn.nextInt();
    }
    
    int n2Size = scn.nextInt();
    int[] n2 = new int[n2Size];
    for(int i =0;i<n2Size;i++){
        n2[i] = scn.nextInt();
    }
    
    int[] result = new int[Math.max(n1Size,n2Size)+1];
    int i = n1.length-1;
    int j = n2.length-1;
    int carry = 0;
    int k = result.length-1;
    while(k>=0){
        int sum = carry;
        if(i>=0){
            sum+=n1[i];
            i--;
        }
        if(j>=0){
            sum+=n2[j];
            j--;
        }
        int q = sum/10;
        int r = sum%10;
        result[k] = r;
        carry = q;
        k--;
    }
    
    for(int a=0;a<result.length;a++){
        if(a==0 && result[a]==0){
            
        }else{
         System.out.println(result[a]);   
        }
    }
    
 }

}
