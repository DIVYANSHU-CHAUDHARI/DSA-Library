
import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int temp_n = n;
 //Counting the no. of digits in the numbers because we want to start dividing the no. by 10^(d-1) where d = no. of digits in the number
 //This is done to get the quotient because we want to start printing from the start.
      int count = 0;
      while(temp_n!=0){
          count++;
          temp_n/=10;
      }
      int div = (int)Math.pow(10,count-1);
      //Math.pow returns a double,This is typecasted into int.
      while(div!=0){
          int quotient = n/div;
          System.out.println(quotient);
          int rem = n%div;
          n = rem;
          div/=10;
      }
     }
    }
