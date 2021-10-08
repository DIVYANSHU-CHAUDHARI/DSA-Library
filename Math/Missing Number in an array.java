//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
//Approach1 : 
//        1.Calculate the sum of first n natural numbers as sumtotal= n*(n+1)/2
    //        2.Create a variable sum to store the sum of array elements.
    //        3.Traverse the array from start to end.
    //        4.Update the value of sum as sum = sum + array[i]
    //        5.Print the missing number as sumtotal - sum

//Approach 2:
        //Assume a1 ^ a2 ^ a3 ^ ...^ an = a and a1 ^ a2 ^ a3 ^ ...^ an-1 = b 
        //Then a ^ b = an
//        Create two variables a = 0 and b = 0
//        Run a loop from 1 to n with i as counter.
//        For every index update a as a = a ^ i
//        Now traverse the array from start to end.
//        For every index update b as b = b ^ array[i]
//        Print the missing number as a ^ b.

    int MissingNumber(int array[], int n) {
        int xor = 0;
        for(int ele:array ){
            xor = xor ^ ele;
        }
        for(int i=1;i<=array.length+1;i++){
            xor = xor ^ i;
        }
        return xor;
    }
