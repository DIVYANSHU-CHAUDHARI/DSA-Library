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
		//Search space (0...N)
		while(l<=r){
		    long mid = (l+r)/2;
		    if(mid*mid<=x){
		        ans = mid;
		        l = mid+1;
		    }else{
		        r = mid-1;
		    }
		}
		
	return ans;	
	 }
}
