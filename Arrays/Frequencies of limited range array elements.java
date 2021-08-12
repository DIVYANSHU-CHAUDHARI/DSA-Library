//Brute force 
//TC:O(n^2)
//SC:(1)
//For every element count its frequency and update it in the array

//Using hashmap
//TC:O(n)
//SC:O(n)
//Using a hashmap to populate the frequency of every distinct element in the array

//More efficient approach
//https://www.youtube.com/watch?v=B2hI-QPoisk
//TC:O(n)
//SC:O(1)
class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        int i = 0;
        while(i<N){
            if(arr[i]>0){
                //pos is the index where the frequency of arr[i] value is updated/present.
                // Find index corresponding to this element
               // For example, index for 5 is 4
                int pos = arr[i]-1;
                //If the element key is not present.eg. [2,3,4,9,5]
                //The frequency of 9 cannot be stored as the size of array is 5 and only frequency of 5 elements can be stored
                //In this case we make the frequency of arr[i] = 0 where i is the index of value 9 and move forward
                if(pos>=N){
                    arr[i] = 0;
                    i++;
                    continue;
                }
               // If the pos index  has an element that is not
               // processed yet, then first store that element
              // to arr[i] so that we don't lose anything.
                if(arr[pos]>0){
                    arr[i] = arr[pos];
                    arr[pos]=-1;
                }else{
                    // If this is NOT first occurrence of arr[i],
                   // then decrement its count.
                    arr[pos]--;
                    // And initialize arr[i] as 0 means the element
                   // 'i+1' is not seen so far
                    arr[i] = 0;
                    i++;
                }
            }else{
                //This index stores the frequency and not the value and therefore we have to move forward to look for values
                // If this element is already processed,
               // then nothing to do
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            //Make the negative frequencies positive now that all the elements are processed
            arr[j] = Math.abs(arr[j]);
        }

    }
}
