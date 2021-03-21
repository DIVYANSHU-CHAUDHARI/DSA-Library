"""
https://practice.geeksforgeeks.org/problems/implement-strstr/1#
"""
#TC:O(|s|)
#SC:O(1)

def strstr(s,x):
    t = 0
    Len = len(s)
     
    # Iterate from 0 to Len - 1
    for i in range(Len):
        if t == len(x):
            break
        if (s[i] == x[t]):
            t += 1
        else:
            t = 0
             
    if (t < len(x)):
        return -1
    else:
        if i==len(s)-1:
            return i-t+1
        else:
            return i-t
