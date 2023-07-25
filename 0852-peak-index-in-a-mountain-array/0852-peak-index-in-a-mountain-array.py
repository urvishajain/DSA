class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        n = len(arr)
        l = 0
        h = n-1
        while(l<h):
            m = int(l + (h-l)//2)
            if (arr[m]>arr[m+1]):
                h = m
            else:
                l = m+1
        return l
        
        
        
        