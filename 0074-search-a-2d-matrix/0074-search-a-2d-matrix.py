class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n=len(matrix)
        m=len(matrix[0])
        def bsearch(arr,k,m):
            l=0
            h=m-1
            while(l<=h):
                mid=l+(h-l)//2
                if (arr[mid]==target):
                    return True
                elif (arr[mid]<target):
                    l=mid+1
                else:
                    h=mid-1
            return False
        for x in matrix:
            if target<=x[-1]:
                return bsearch(x,target,m)
            