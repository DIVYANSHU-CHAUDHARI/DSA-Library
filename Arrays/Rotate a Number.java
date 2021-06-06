/*
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
*/
import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     int num = n;
     int nod = 0;
     while(num!=0){
         num/=10;
         nod++;
     }
     k = k % nod; // (-(k-1) to (k-1)) range of k for positive or negative values of k
     if(k<0){
         k+=nod;
     }
     int div = (int)Math.pow(10,k);
     int q = n / div;
     int r = n % div;
     int multiplier = (int)Math.pow(10,nod-k);
     int ans = r*multiplier + q;
     System.out.println(ans);
     
   }
}
