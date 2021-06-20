//https://classroom.pepcoding.com/myClassroom/the-switch-program-3/string,-stringbuilder-and-arraylist/print-all-permutations-of-a-string-iteratively-official/ojquestion

//Step1.No. of permutations of the string = factorial(n);
//Step2.Vary num from (0 to factorial(n)-1)
//Step3.For every num divide it by divisor(which is the length of the string initially ,decremented in every iteration till div>=1)
//Step4:Whle dividing num by div,calculate remainder(r) and quotient(q) in every iteration .Print str.chaAt(r),then remove that index character from str  
//      by str.deleteCharAt(r) and then div--;
//Step5:Repeat step4 till div>=1;this will print one permutation in every iteration

import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
	    int nf = 1;
	    for(int i=2;i<=str.length();i++){
	        nf*=i;
	    }
		for(int i=0;i<nf;i++){
		    int num = i;
	        int div = str.length();
		    StringBuilder sb = new StringBuilder(str);
		    while(div>=1){
		        int r = num % div;
		        int q = num / div;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        num = q;
		        div--;
		        }
		    System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
