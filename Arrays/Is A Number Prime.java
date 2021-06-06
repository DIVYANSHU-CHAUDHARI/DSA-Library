//Approach1
//TC:O(n)
import java.util.*;  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      for(int i = 1;i<=t;i++){
        int n = scn.nextInt();
        #Main Code ############
        int factors = 0;
        for(int div = 2;div<n;div++){
            if(n%div==0){
                factors++;
            }
         }
        if (factors == 0){
              System.out.println("prime");
        }else{
            System.out.println("not prime");
        }   
        #########################33
      }
   }
  }
//Approach2:Break Statement
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      for(int i = 1;i<=t;i++){
        int n = scn.nextInt();
        int factors = 0;
        for(int div = 2;div<n;div++){
            if(n%div==0){
                factors++;
                break;
            }
         }
        if (factors == 0){
              System.out.println("prime");
        }else{
            System.out.println("not prime");root
        }    
      }
   }
//Approach3:
//TC:O(root(n))
//Even if we find a factor f1 less than root(n) which divides n.Than it is sufficient to say that n is not prime.We do not need to check
          //for the counterpart f2 as it will definitely divide n.Therefore we dont need to check for f2.
// f1*f2 = n than there exists f1 among f1 and f2 such that f1<=f2 .
//f1 and f2 simultaneously cannot be greater than root(n).We only check for f1's which can divide n whose possible values are tillmaximum root(n).
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      for(int i = 1;i<=t;i++){
        int n = scn.nextInt();
        int factors = 0;
        for(int div = 2;div*div<= n;div++){
            if(n%div==0){
                factors++;
                break;
            }
         }
        if (factors == 0){
              System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
          
      }
      
