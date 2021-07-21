
//https://classroom.pepcoding.com/myClassroom/the-switch-program-3/recursion-with-arraylist/get-stair-paths-official/ojquestion
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }else if(n<0){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        ArrayList<String> list1 = getStairPaths(n-1);
        ArrayList<String> list2 = getStairPaths(n-2);
        ArrayList<String> list3 = getStairPaths(n-3);
        ArrayList<String> ans = new ArrayList<>();
        for(String str:list1){
            ans.add("1" + str);
        }
        for(String str:list2){
            ans.add("2"+str);
        }
        for(String str:list3){
            ans.add("3" + str);
        }
        return ans;
    }

}
