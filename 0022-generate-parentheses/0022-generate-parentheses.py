class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        global ans
        def generatePHelper(n,o,s):
            global ans
            if o==0 and len(s)==(2*n):
                ans.append(s)
                return 
            elif o<0 or len(s)>(2*n):
                return 
            generatePHelper(n,o+1,s+'(')
            generatePHelper(n,o-1,s+')')
            
            return
                
                
                
        ans = []
        
        generatePHelper(n,0,"")
        return ans 
        
        