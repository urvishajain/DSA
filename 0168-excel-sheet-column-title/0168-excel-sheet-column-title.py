class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        c=columnNumber
        res=[]
        while(c>0):
            res.append(chr(((c-1)%26) +65))
            c=(c-1)//26
            
        return ''.join(reversed(res))
        