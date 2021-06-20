/*
1. You are given an ArrayList of positive integers.
2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

Note -> The order of elements should remain same.
*/

//Only take care when to increment and when not.
//We dont increment i when we delete an element as array shifted left by 1.
//Otherwise we increment by 1;
import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i=0;i<al.size();){
		    if(checkPrime(al.get(i))){
		        //We dont increment i when we delete an element as array shifted left by 1.
		        al.remove(i);
		    }else{
		        i++;
		    }
		}
	
	}
	public static boolean checkPrime(int n){
	    for(int i=2;i*i<=n;i++){
	        if(n%i==0){
	            return false;
	        }
	    }
	    return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
