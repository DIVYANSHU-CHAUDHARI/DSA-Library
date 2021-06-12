1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	
  
//First build the structure using * than fill the values using i and j.

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int spaces = 2*n-3;
    int stars = 1;
    for(int i = 1;i<=n;i++){
        for(int j=1;j<=stars;j++){
            System.out.print(j+"\t");
        }
        for(int j=1;j<=spaces;j++){
            System.out.print("\t");
        }
        if(i==n){
            stars--;
        }
        for(int j=stars;j>=1;j--){
            System.out.print(j+"\t");
        }
        System.out.println();
        stars+=1;
        spaces-=2;
    }
    


 }
}
