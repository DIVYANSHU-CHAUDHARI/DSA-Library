//https://leetcode.com/problems/implement-strstr/
//TC:(m*n)
//SC:O(1)
// https://www.youtube.com/watch?v=TsxFvVy_5m0
class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if(n==0)return 0;
        if(m==0)return -1;
        if(m<n)return -1; 
        for(int i=0;i<=m-n;i++){
            int j;
            for(j=0;j<n;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j))break;
            }
            if(j==n)return i;
        }
        return -1;
    }
}
