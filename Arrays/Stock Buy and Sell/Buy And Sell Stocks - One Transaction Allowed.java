import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i] = scn.nextInt();
        }
        int maximumProfit = Integer.MIN_VALUE;
        int mintillNow = prices[0];
        for(int i=0;i<prices.length;i++){
            int currPrice = prices[i];
            if(currPrice<mintillNow){
                mintillNow = currPrice;
            }else{
                maximumProfit = Integer.max(maximumProfit,currPrice-mintillNow);
            }

        }
        System.out.println(maximumProfit);
    }

}
