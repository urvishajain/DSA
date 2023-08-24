class Solution:
    def fullJustify(self, words: List[str], maxWidth: int) -> List[str]:
        i=0
        n=len(words)
        res=[]
        while(i<n):
            wc=len(words[i])
            j=i+1
            can=0
            while(j<n and (wc+can+len(words[j])+1)<=maxWidth):
                wc+=len(words[j])
                can+=1
                j+=1
            vac=(maxWidth-wc)
            can=(j-i-1)
            if can==0:
                extra=0
                atleast=0
            else:
                atleast=vac//can
                extra=vac%can
            if j==n:
                atleast=1
                extra=0
            st=""
            for k in range(i,j):
                st+=words[k]
                if k==(j-1):
                    break
                for e in range(0,atleast):
                    st+=' '
                if extra:
                    st+=' '
                    extra-=1
            while(len(st)<maxWidth):
                st+=' '
            res.append(st)
            i=j
        return res
            
            
        
        