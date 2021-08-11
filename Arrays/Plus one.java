//https://practice.geeksforgeeks.org/problems/plus-one/1/#
//TC:O(n)
//SC:O(1)
class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        int carry = 1;
        int sum = 0;
        for(int i=arr.size()-1;i>=0;i--){
            sum = (arr.get(i)+carry)%10;
            carry = (arr.get(i)+carry)/10;
            arr.set(i,sum);
        }
        if(carry == 1)arr.add(0,1);
        return arr;
    }
};
