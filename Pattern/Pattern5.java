//n=5
//    * 
//  * * * 
//* * * * *
//  * * * 
//    * 
//Approach:
//1.Incrementation and decrementation of no. of stars and spaces depends upon which half we are in.
//2.Spaces decrement and increment by 1 and stars increment and decrement by 2
//3.Half is determined by which row we are in.If rowNo<=(n/2) then firsthalf and rowNo>(n/2) then second half.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int spaces = n / 2;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=spaces;j++){
                System.out.print("\t");
            }
            for(int j =1;j<=stars;j++){
                System.out.print("*\t");
            }
            System.out.println();
            
            if(i<=n/2){
               stars+=2;
               spaces--;
            }else{
              stars-=2;
              spaces++;
           }

    }
}
}
