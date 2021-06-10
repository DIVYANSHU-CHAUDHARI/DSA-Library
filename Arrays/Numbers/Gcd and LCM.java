//1.Main aim is to calculate GCD
//2.After calculating GCD,LCM can be calculated using (n1*n2)/gcd
//3.Till remainder is 0,calculate remainder iteratively by making (current divisor = previous remainder) and (current dividend = previous divisor)
import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int num1 = scn.nextInt();
          int num2 = scn.nextInt();
          int dividend = num1;
          int divisor = num2;
          int remainder = dividend%divisor;
          while(remainder!=0){
              dividend = divisor;
              divisor = remainder;
              remainder = dividend%divisor;
              
          }
          int gcd = divisor;
          int lcm = (num1*num2)/gcd;
          System.out.println(gcd);
          System.out.println(lcm);
          
     }
    }
