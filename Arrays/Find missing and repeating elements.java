//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1#

class Solve {
    int[] findTwoElement(int arr[], int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int N = n;
        int A=0,B=0;
        while(N > 0){
            if(!map.containsKey(N)){
                A = N;
                break;
            }
            N--;
        }
        
        for(int ele:map.keySet()){
            if(map.get(ele)==2){
                B = ele;
                break;
            }
        }
        int[] result = new int[2];
        result[0] = B;
        result[1] = A;
        return result;
        
    }
}
