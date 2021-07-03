/*
Another approach : 
1. Take two pointer type0(for element 0) starting from beginning (index = 0) and type1(for element 1) starting from end (index = array.length-1). 
Initialize type0 = 0 and type1 = array.length-1 
2. It is intended to Put 1 to the right side of the array. Once it is done, then 0 will definitely towards left side of array.
*/
import java.io.*;
import java.util.*;

public class Main {

  public static void sort01(int[] arr){
    int i = 0;
    int j = arr.length-1;
    
    while(i<=j){
        if(arr[i]==1){
            swap(arr,i,j);
            j--;
        }else{
            i++; 
        }
    }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort01(arr);
    print(arr);
  }
}
