//1.jabtak n1 or n2 or carry nonzero hai while loop chalega
//2.Take the last digits of both nos and add them alongwith carry.
//3.Next carry = (l1+l2+carry)/b where l1,l2 are last digits of both nos and carry from previous addition.b is the base of the nos.
//4.Present addition = (l1+l2+carry)%b
//5.Do steps 2 to 4 till step1 is satisfied.

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       int power=1;
       int result = 0;
       int carry = 0;
       while(n1!=0 || n2!=0 || carry!=0){
           int lastDigitn1 = n1%10;
           int lastDigitn2 = n2%10;
           int sum = carry+lastDigitn1+lastDigitn2;
           int lastDigit = (sum)%b;
           carry = (sum)/b;
           result+=(power*lastDigit);
           power*=10;
           n1/=10;
           n2/=10;
       }
       return result;
   }
  }
