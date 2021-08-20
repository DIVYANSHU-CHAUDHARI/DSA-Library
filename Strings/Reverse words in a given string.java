//TC:O(|S|)
//SC:O(|S|)

String reverseWords(String S)
    {
        String result = "";
        String arr[] = S.split("\\.");
        for(int k=arr.length-1;k>=0;k--){
            if(k==arr.length-1){
                result = result + arr[k];
            }else{
                result = result + "." + arr[k];
            }
        }
     return result;   
    }
