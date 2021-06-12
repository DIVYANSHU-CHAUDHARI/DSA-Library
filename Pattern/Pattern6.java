import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = n/2+1;
        int spaces = 1;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=stars;j++){
                System.out.print("*\t");
            }
            for(int j =1;j<=spaces;j++){
                System.out.print("\t");
            }
            for(int j =1;j<=stars;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
               stars--;
               spaces+=2;
            }else{
              spaces-=2;
              stars++;
           }
    }

    }
}
