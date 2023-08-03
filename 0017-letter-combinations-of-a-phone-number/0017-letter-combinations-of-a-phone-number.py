class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        
        
        # digit=list(digits)
        def helper(digit):
            ans=[]
            d={2:['a','b','c'],3:['d','e','f'],4:['g','h','i'],5:['j','k','l'],6:['m','n','o'],7:['p','q','r','s'],8:['t','u','v'],9:['w','x','y','z']}
            if len(digit) ==0:
                return 
            if len(digit)==1:
                return d[int(digit[0])]
            x=int(digit[0])
            temp=(helper(digit[1:]))
            for y in d[x]:
                ans+=[y+k for k in temp]
            return ans 
        return helper(list(digits))
              