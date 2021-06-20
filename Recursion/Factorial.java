//https://classroom.pepcoding.com/myClassroom/the-switch-program-3/introduction-to-recursion/factorial-official/ojquestion
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n==1)return 1;
        return n*factorial(n-1);
    }

}
