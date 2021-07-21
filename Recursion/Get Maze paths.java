//https://classroom.pepcoding.com/myClassroom/the-switch-program-3/recursion-with-arraylist/get-maze-paths-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(getMazePaths(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }else if(sr>=dr+1 || sc>=dc+1){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        ArrayList<String> paths1 = getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> paths2 = getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> paths = new ArrayList<>();
        
        for(String str:paths1){
            paths.add("h"+str);
        }
        for(String str:paths2){
            paths.add("v"+str);
        }
        
        return paths;
    }

}
