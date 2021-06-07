//Approach1:TLE
//Maintain unique elements for all the 3 arrays in their respective hashsets and pick the common in these hashsets.
//After a common element is found,before searching for other common elements,remove the common element from all the 3 hashsets.
//This will ensure that even if have same item repeated twice in all 3 arrays,we output only one item if that to avoid dupication in output.
//TC:O(x+y+z) where x,y and z are sizes of the 3 arrays
//SC:O(x+y+z)
//Instead of using a HashSet,HashMap can also be used to keep count of every item.Only here check if the same item has occurences greater than 0 
//in all the three arrays.
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        HashSet<Integer> m1= new HashSet<Integer>();
        HashSet<Integer> m2= new HashSet<Integer>();
        HashSet<Integer> m3= new HashSet<Integer>(); 
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            m1.add(A[i]);
        }
        for(int i=0;i<B.length;i++){
            m2.add(B[i]);
        }
        for(int i=0;i<C.length;i++){
            m3.add(C[i]);
        }
        for(int i=0;i<A.length;i++){
            if(m1.contains(A[i]) && m2.contains(A[i]) && m3.contains(A[i])){
                result.add(A[i]);
                m1.remove(A[i]);
                m2.remove(A[i]);
                m3.remove(A[i]);
            }
        }
        return result;
    }
}

//Approach2:Using 3 pointers simultanously and then skipping over those indices which are duplicates
//TC:O(x+y+z), where x,y and z are sizes of the 3 arrays
//SC:O(1)
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
       int x = 0;
       int y = 0;
       int z = 0;
       ArrayList<Integer> result = new ArrayList<>();
       while(x<n1 && y<n2 && z<n3){
           if(A[x]==B[y] && B[y]==C[z]){
               result.add(A[x]);
               x++;
               y++;
               z++;
           }
           else if(A[x]<B[y]){
               x++;
           }
           else if(B[y]<C[z]){
               y++;
           }
           else{
               z++;
           }
           if (x>=1 && x<n1){
               int xx = A[x-1];
               while(x<n1 && A[x]==xx){
                   x++;
               }}
           if (y>=1 && y<n2){
               int yy = B[y-1];
               while(y<n2 && B[y]==yy){
                   y++;
               }}
           if (z>=1 && z<n3){
               int zz = C[z-1];
               while(z<n3 && C[z]==zz){
                   z++;
               }}
       }
       return result;
    }
}
