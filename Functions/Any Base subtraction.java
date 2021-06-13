import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       int power=1;
       int result = 0;
       int bor = 0;
       int sub;
       //here only n2 in while loop because we want the loop to run only length of n2 times because the the answer can be maximum of n2 length.
       //This is not the case in any base addition.
       while(n2!=0){
           int l1 = n1%10;
           int l2 = n2%10;
           if(l2<(l1+bor)){
               sub = (b+l2)-(l1+bor);
               bor = 1;
           }else{
               sub = (l2)-(l1+bor);
               bor = 0;
           }
           result+=(power*sub);
           power*=10;
           n1/=10;
           n2/=10;
       }
       return result;
   }
  
  }
