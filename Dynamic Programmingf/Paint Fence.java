import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] same = new int[n+1];
        int[] diff = new int[n+1];
        same[1] = 0;
        diff[1] = k;
        
        for(int i=2;i<=n;i++){
            same[i] = diff[i-1];
            diff[i] = (same[i-1]+diff[i-1])*(k-1);
        }
        int ans = same[n]+diff[n];
        System.out.println(ans);
    }
    

}
