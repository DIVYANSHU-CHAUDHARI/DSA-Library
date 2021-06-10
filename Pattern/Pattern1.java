//n=5
//* 
//* * 
//* * * 
//* * * * 
//* * * * *

//Consider outer loop as row and inner loop as column
//After inner loop gets completed, use System.out.println("") to enter(go to next line)
//ith row contains i stars

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println("");
        }

    }
}
