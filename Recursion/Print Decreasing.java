//https://classroom.pepcoding.com/myClassroom/the-switch-program-3/introduction-to-recursion/print-decreasing-official/ojquestion

//Assume for smaller input of the function that will prit from n-1 to 1 
//I have to only add n to this ans 
//for base case n==0:return 

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n==0)return;
        System.out.println(n);
        printDecreasing(n-1);
        
        
    }

}
