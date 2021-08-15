//https://practice.geeksforgeeks.org/problems/square-root/1/?track=amazon-searching&batchId=192
//https://drive.google.com/drive/u/1/folders/1ABjYHynsf830dE5Kz0mg_2worJ_V212-
//Prateek narang

//Linear search approach
//TC:O(root(n))
//SC:O(1)
class Solution
{
     long floorSqrt(long x)
	 {
		long ans = 0;
		while(ans*ans<=x){
		    ans++;
		}
	return ans-1;	
	 }
}

//Binary search approach
//TC:O(logn)
//SC:O(1)
class Solution
{
     long floorSqrt(long x)
	 {
		    long ans = 0;
		    long l = 0;
		    long r = x;
	     //Search space is (0....N)
		    while(l<=r){
		        long mid = (l+r)/2;
		        if(mid*mid==x){
		            return mid;
		        }else if(mid*mid<x){
    		        ans = mid;
    		        l = mid+1;
		        }else{
		            r = mid-1;
		        }
		    }
		return ans;	
	 }
}


//With floating part included eg sqrt of 18 is 4.24 i.e 2 floating point places(p=2)
static float root(int N,int p) {
        float ans = 0;
        int l = 0;
        int r = N-1;
        //Integer part of the ans
        while(l<=r){
            int mid = (l+r)/2;
            if(mid*mid<=N){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        //Floating point part of the ans
        //checking from 0...9 to get as close to the answer as possible
        float inc = 0.1f;
        for(int i=1;i<=p;i++){
            while(ans*ans<=N){
                ans = ans + inc;
            }
            ans = ans - inc;
            inc = inc/10.0f;
        }

        return ans;
    }
