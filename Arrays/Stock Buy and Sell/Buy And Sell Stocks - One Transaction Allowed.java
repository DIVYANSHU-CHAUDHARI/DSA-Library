//Left to right interation updating maxprofit using minimum value find till now.

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

////right to left interation updating maxprofit using maximum value find till now.
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
        int maxsofar = prices[n-1];
        int maxprofit = Integer.MIN_VALUE;    
        for(int i=prices.length-2;i>=0;i--){
            if(prices[i]>maxsofar){
                maxsofar = prices[i];
            }else{
                maxprofit = Integer.max(maxprofit,maxsofar-prices[i]);
            }
            
        }
        System.out.println(maxprofit);
    }

}
