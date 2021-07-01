import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnby2 = power(x,n/2);
        int xn = xnby2*xnby2;
        if(n%2!=0){
            xn = xn*x;
        }
        return xn;
    }

}
