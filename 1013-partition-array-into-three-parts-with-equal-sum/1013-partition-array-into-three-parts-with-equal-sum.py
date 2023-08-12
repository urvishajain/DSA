class Solution:
    def canThreePartsEqualSum(self, arr: List[int]) -> bool:
        s = sum(arr)
        t =s
        s = s //3
        n = len(arr)
        cnt=0
        flag =0
        
        if t%3!=0:
            return False
        
        for i in range(n):
            cnt+=arr[i]
            if cnt==s:
                cnt =0
                flag+=1
           
        
            
        if flag>2:   
            
            return True
        
   
        return False
        