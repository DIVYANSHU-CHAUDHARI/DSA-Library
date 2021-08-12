//https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1#
//TC:O(n)
//SC:O(n)
class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        int i = 0;
        ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
        if(n==0 || n==1)return result;
        while(i<n-1){
            //Finding Local Minima. Note that the limit of loop is (n-2)
            //as we are comparing present element to the next element.
            while(i<n-1 && A[i+1]<=A[i])i++;
            //If we reach the end, we break loop as no further 
            //solution is possible.
            if(i==n-1)break;
          //Storing the index of minima which gives the day of buying stock.
            int p = i;
            i++;
           //Finding Local Maxima. Note that the limit of loop is (n-1)
            //as we are comparing present element to previous element.
            while(i<n && A[i-1]<=A[i])i++;
          //Storing the index of maxima which gives the day of selling stock.
            int q = i-1;
            
            ArrayList<Integer> pair = new ArrayList<Integer>();
            pair.add(p);
            pair.add(q);
            result.add(pair);
        }
        return result;
    }
}
