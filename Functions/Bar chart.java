			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*	
//1.nrows = length of the array
//2.ncols = maximum value in the array
//3.Here,we start row loop backwards from (nrows to 1) and column loop from (0 to ncols) as we will use cols index to access array elements
//4.If arr[j]>=i print(*) else print(space)
//5.We print * only when the current row(floor) height is greater than the height of the building on the jth index.Else prnt space.
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int nsize = scn.nextInt();
    int[] n = new int[nsize];
    for(int i=0;i<nsize;i++){
        n[i]=scn.nextInt();
    }
    int x = n[0];
    for(int i=0;i<nsize;i++){
        if(n[i]>x){
            x = n[i];
        }
    }
    int nrows = x;
    int ncols = n.length;
    
    for(int i=x;i>=1;i--){
        for(int j =0;j<ncols;j++){
            if(n[j]>=i){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

}
