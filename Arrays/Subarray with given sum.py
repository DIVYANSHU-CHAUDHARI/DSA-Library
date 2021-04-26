'''
https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
'''
    def subArraySum(self,arr, n, s): 
        wsum = 0
        start = 0
        
        for i in range(n):
            wsum+=arr[i]
            
            while wsum>s:
                wsum-=arr[start]
                start+=1
            
            if wsum == s:
                return [start+1,i+1]
                
        return [-1]   
    
