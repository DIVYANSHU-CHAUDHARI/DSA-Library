//Consider outer loop as row and inner loop as column
//After inner loop gets completed, use System.out.println("") to enter(go to next line)

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i =0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*\t");
            }
            System.out.println("");
        }

    }
}
