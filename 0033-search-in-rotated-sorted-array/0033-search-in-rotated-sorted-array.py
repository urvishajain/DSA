class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l=0
        a=nums
        h=len(nums)-1
        while(l<=h):
            se=a[l]
            ee=a[h]
            m=(l+h)//2
            if a[m]==target:
                return m
            if a[m]<se:
                if target>=a[m] and target<=ee:
                    l=m+1
                else:
                    h=m-1
            else:
                if target>=se and target<=a[m]:
                    h=m-1
                else:
                    l=m+1
        return -1
                    
                    
                
                    
                