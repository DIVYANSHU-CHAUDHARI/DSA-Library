//Approach
//1.Divide the no. by the given base till we get n=0;
//2.Simultaneously store the remainder in evry iteration multiplied by 10^(weight of that position).
//3.Get the sum of remainder*10^(weight) for every iteration and return sum
import java.util.*;
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int power = 1;
       int result = 0;
       while(n!=0){
           int rem = n%b;
           result+=(rem*power);
           power*=10;
           n=n/b;
       }
       return result;
   }
  }
