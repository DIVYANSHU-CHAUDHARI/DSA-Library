		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	
      
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int spaces = (n-1)/2;
        for(int i=1;i<=n;i++){
            if(i==((n+1)/2)){
                for(int j=1;j<=(n-1)/2;j++){
                    System.out.print("*\t");
            }}
            if(i!=((n+1)/2)){
                for(int j=1;j<=spaces;j++){
                    System.out.print("\t");
                }}
            for(int j=1;j<=stars;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                stars++;
            }else{
                stars--;
            }
        }

    }
}
