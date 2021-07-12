//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/

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
        
        int[] lefttoright = new int[n];
        int[] righttoleft = new int[n];
        
        int maximumProfit = 0;
        int minsofar = prices[0];
        lefttoright[0] = 0;
        for(int i=1;i<prices.length;i++){
            int currPrice = prices[i];
            if(currPrice<minsofar){
                minsofar = currPrice;
            }else{
                maximumProfit = Integer.max(maximumProfit,currPrice-minsofar);
            }
            lefttoright[i] = maximumProfit;
        }
        
        int maxsofar = prices[n-1];
        int maxprofit = 0; 
        righttoleft[prices.length-1] = 0;
        
        for(int i=prices.length-2;i>=0;i--){
            if(prices[i]>maxsofar){
                maxsofar = prices[i];
            }else{
                maxprofit = Integer.max(maxprofit,maxsofar-prices[i]);
            }
            righttoleft[i] = maxprofit;
        }
        
        //lefttoright[i] gives the maximum profit for atmost 1 transaction from 0 to ith index
        //righttoleft[i] gives the maximum profit for atmost 1 transaction from last index to the ithe index
        
        int maximum = 0;
        for(int i=0;i<n;i++){
            maximum = Integer.max(maximum,lefttoright[i]+righttoleft[i] );
        }
        
        System.out.println(maximum);
    }
}
