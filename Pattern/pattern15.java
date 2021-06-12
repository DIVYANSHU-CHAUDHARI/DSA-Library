		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = n/2;
        int stars = 1;
        int oval = 1;
        for(int i=1;i<=n;i++){
            int ival = oval;
            for(int j=1;j<=spaces;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=stars;j++){
                System.out.print(ival+"\t");
                if(j<=stars/2){
                    ival++;
                }else{
                    ival--;
                }
            }
            System.out.println();
            if(i<=n/2){
                spaces--;
                stars+=2;
                oval++;
            }else{
                spaces++;
                stars-=2;
                oval--;
            }            
        }
    }
}
