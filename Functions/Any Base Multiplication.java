import java.util.*;
public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     int power = 1;
     int sum = 0;
     
     while(n2!=0){
         int d2 = n2%10;
         int gpwsd = gpwsd(n1, d2,b);
       //sum calculates anybase sum of the current multiplication with the previous sum using Anybase addition method
       //gpwsd*power is similar to how we multiply two numbers normally.
         sum = aba(sum,gpwsd*power,b);
         n2/=10;
         power*=10;
     }
     return sum;
 }
  //Calculate product with single digit of n2 and whole of n1.
  public static int gpwsd(int n1, int d2, int b){
     int ans = 0;
     int power = 1;
     int carry = 0;
     while(n1!=0||carry!=0){
         int l1 = n1%10;
         int product = d2*l1+carry;
         int r = product%b;
         int q = product/b;
         ans+=power*r;
         power*=10;
         carry = q;
         n1/=10;
     }
     return ans;
 }
  //Any base addition used for summing product of every multiplication operation done by gpwsd method.
 public static int aba(int n1, int n2,int b){
     int ans = 0;
     int carry = 0;
     int power = 1;
     
     while(n1!=0 || n2!=0 || carry!=0){
         int l1 = n1%10;
         int l2 = n2%10;
         int sum = l1+l2+carry;
         int q = sum/b;
         int r = sum%b;
         ans+=power*r;
         carry = q;
         power*=10;
         n1/=10;
         n2/=10;
         
     }
     return ans;
 }


}
