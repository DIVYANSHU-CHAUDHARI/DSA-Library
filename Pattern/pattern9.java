//n=5
*				*	
	*		*		
		*			
	*		*		
*				*	
//We consider this like a 2d matrix 
//Whenever i==j,one diagonal line stars are printed and when i+j==n+1 other diagonal line stars are printed
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i==j){
                    System.out.print("*\t");
                }else if((i+j)==(n+1)){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
