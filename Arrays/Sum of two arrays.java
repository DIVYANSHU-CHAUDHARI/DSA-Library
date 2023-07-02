Question: https://www.youtube.com/watch?v=aSb29e8OoZs

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n1 = 5;
    int[] a1 = new int[]{ 3, 1, 0, 7, 5 };
    int n2 = 6;
    int[] a2 = new int[]{ 1, 1, 1, 1, 1, 1 };

    int[] sum = new int[n1 > n2 ? n1 : n2];
    int i = n1 - 1;
    int j = n2 - 1;
    int k = sum.length - 1;
    int c = 0;
    //While anyone of the array exists
    while (i >= 0 || j >= 0) {
      int d = c;
      
      //If first array exists, add it to the current sum
      if (i >= 0)
        d += a1[i];
      
      // If second array exists, add it to the current sum
      if (j >= 0)
        d += a2[j];

      c = d / 10;
      d = d % 10;
      sum[k] = d;

      i--;
      j--;
      k--;
    }
    //If carry exists till the last than print it first and than following digits
    if (c > 0) {
      System.out.println(c);
    }
    for (int val : sum) {
      System.out.println(val);
    }
  }

}
