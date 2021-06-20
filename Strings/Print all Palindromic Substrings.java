import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
	    //Substring continuous part of a string.
	    //Check for substring starting from every character for every lengths.
	    //If palindrome,print them.
		for(int si=0;si<str.length();si++){
		    for(int ei=si;ei<str.length();ei++){
		        if(palCheck(str.substring(si,ei+1))){
		            System.out.println(str.substring(si,ei+1));
		        }
		    }
		}
		
	}
	//To check if the substring is a palindrome
	public static boolean palCheck(String str){
	    int start = 0;
	    int end = str.length()-1;
	    boolean pal = true;
	    while(start<end){
	        if(str.charAt(start)!=str.charAt(end)){
	            pal = false;
	            break;
	        }
	        start++;
	        end--;
	    }
	    return pal;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
