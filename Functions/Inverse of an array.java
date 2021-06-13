//1.Make a new array
//2.Traverse on the old array and assign index as value and value as index in the new array.

public static int[] inverse(int[] a){
    int[] inva = new int[a.length];
    for(int i=0;i<a.length;i++){
        inva[a[i]]= i;
    }
    return inva;
  }
