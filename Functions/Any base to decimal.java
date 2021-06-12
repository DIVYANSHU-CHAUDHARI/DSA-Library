//1.Remove last digit
//2.Multiply lastdigit * base^(weight)
//3.n=n/10
//3.Sum (lastdigit * base^(weight)) for every iteration and return sum.
import java.util.*;
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
       int result=0;
       int power = 1;
      while(n!=0){
          int rem = n%10;
          result+=(rem*power);
          power*=b;
          n/=10;
      }
      return result;
   }
  }
