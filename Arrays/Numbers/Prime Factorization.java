//Approach1 (TC:O(n))
//1.Start dividing the number from 2.divisor = 2;
//2.Do step 3 and 4 till n!=1
//3.Jabtak divisor n ko divide karraha hai,tabtak divide karo and update n as n/=divisor in every iteration.
//4.When a divisor dosent fully divide,increment the divisor and start from step 3.

//Approach2 (TC:O(root(n)))
//1.Check for divisors only till root(n)
//2.If n is not 1 after the loop ends, then there is definitely only one prime factor which is greater than root(n) and that is n(after the divisions)

//Fact:There will be only one prime factor greater than root(n). eg:46 (23 which is greater than root(46) ie 6..)

import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int dividend = scn.nextInt();
    int divisor = 2;
    
    while(dividend!=1){
        if(dividend%divisor==0){
            System.out.print(divisor+" ");
            dividend/=divisor;
        }
        else{
            divisor++;
        }
    }
 }
}
//Approach2
//More Concise code
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for(int divisor = 2;n!=1;divisor++){
        while(n%divisor==0){
            System.out.print(divisor+" ");
            n/=divisor;
        }
    }
 }
}

//Most Efficient Code
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for(int divisor = 2;divisor*divisor<=n;divisor++){
        while(n%divisor==0){
            n/=divisor;
            System.out.print(divisor+" ");
        }
    }
    if(n!=1){
        //This is the prime factor that is greater than root(n)
        //There will be only one prime factor that is greater than root(n)
        System.out.print(n);
    }
 }
}
