class Solution:
    def minimumIndex(self, nums: List[int]) -> int:
        def majorityele(nums):
            if len(nums)>0:
                m = nums[0]
                c =1
                for x in nums:
                    if x==m:
                        c+=1
                    else:
                        c-=1
                    if c<0:
                        m =x
                        c =1
                return m
            
            
        k = majorityele(nums)
        # print(k)
        n=len(nums)
        c=0
        count = nums.count(k)
        # print(count)
        
        for x in range(n):
            if nums[x]==k:
                c+=1
            # print(c,n,x)
            if c>((x+1)//2) and (count-c)>((n-x-1)//2):
                return x
        return -1
        
            
        
        