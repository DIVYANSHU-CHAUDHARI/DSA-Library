//1.reverse the entire array.
//2.reverse first k elements in the reversed array.
//3.reverse the remaining elements after the first k elements.

//Note:-- take care of the no. of rotations and bring them in the range (0,arr.length-1)
public static void rotate(int[] a, int k){
      k = k%a.length;
      if(k<0){
          k+=a.length;
      }
      reverse(0,a.length-1,a);
      reverse(0,k-1,a);
      reverse(k,a.length-1,a);
    
  }
  public static void reverse(int left,int right,int[] arr){
      while(left<right){
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
          left++;
          right--;
      }
  }
