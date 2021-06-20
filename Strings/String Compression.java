//https://classroom.pepcoding.com/myClassroom/the-switch-program-3/string,-stringbuilder-and-arraylist/string-compression-official/ojquestion
import java.io.*;
import java.util.*;
//1.Insert the first character of the string to the ans string.
//2.If the current character of the string is not equal to the last character of answer string then append the current character to the answer string.

public class Main {

	public static String compression1(String str){
		String result = "";
	    int count = 1;
		result+=str.charAt(0);
		for(int i=1;i<str.length();i++){
		    char ch = str.charAt(i);
		    if(result.charAt(result.length() - 1) != ch){
		        result += ch;
		    }
		}
		return result;
	}
//1.Insert the first character of the string to the ans string.
//2.Keep a variable count which will keep count of the current charcater frequency.
//3.If the current character is not equal to the the last character of ans,we append the count of the previous character,reset the count to 1 and append the new character and then proceed counting the new character and repeat this step again.
//4.Remember to append the last charcter count as it gets missed in the loop.
	public static String compression2(String str){
	    String result = "";
		result+=str.charAt(0);
		int count = 1;
		for(int i=1;i<str.length();i++){
		    char ch = str.charAt(i);
		    
		    if(result.charAt(result.length() - 1) == ch){
		        count++;
		    }else{
		        if(count>1){
		            result+=count;
		        }
		        result+=ch;
		        count= 1;
		    }
		}
		if(count>1){
		      result+=count;
		}
	
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
