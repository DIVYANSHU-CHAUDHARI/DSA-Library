import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int a = 0;
      int b = 1;
      System.out.println(a);
      System.out.println(b);
      for(int i = 0;i<n-2;i++){
          int next = a + b;
          System.out.println(next);
          a = b;
          b = next;
      }
   }
  }
