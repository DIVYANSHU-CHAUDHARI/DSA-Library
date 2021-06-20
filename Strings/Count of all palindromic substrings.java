//https://classroom.pepcoding.com/myClassroom/the-switch-program-3/string,-stringbuilder-and-arraylist/cpss-official/ojquestion
//This is axis and orbit method to count total substrings.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int palCount = 0;
        
        //In this loop I am considering every character as the middle of the palindrome
        //and checking if its left and right element are equal.
        //If they are equal,that counts to 1 palindrome
        //decrement left and increment  right to check if the more farther elements are equal
        //We do this and  increment palCount till we get get unequal characters
        
        for(int i=0;i<str.length();i++){
            int left = i-1;
            int right = i+1;
            //Individual count of characters as palindromes
            palCount++;
            while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
                left--;
                right++;
                palCount++;
            }
        }
        //In this loop we consider two elements as middle elements of a palindrome.
        //We check if they are equal.If they are,we increment right and decrement left to check further.
        //We break and then check the same for the next two characters and do the same process. 
        for(int cut=0;cut<str.length()-1;cut++){
            int left = cut;
            int right = cut+1;
            
            while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
                left--;
                right++;
                palCount++;
            }
        }
        System.out.println(palCount);
    }
}
