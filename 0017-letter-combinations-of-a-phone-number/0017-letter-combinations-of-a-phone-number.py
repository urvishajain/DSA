class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        global d
        d={2:['a','b','c'],3:['d','e','f'],4:['g','h','i'],5:['j','k','l'],6:['m','n','o'],7:['p','q','r','s'],8:['t','u','v'],9:['w','x','y','z']}
        def helper(digits): 
            global d
            if len(digits)==0:
                return []
            elif len(digits) ==1:
                print(digits)
                print(digits[0])
                return d[int(digits[0])]


            k = self.letterCombinations(digits[1:])
            print(k)
            p = d[int(digits[0])]
            print(p)
            ans =[]
            for i in p:
                t= ""
                for j in k:
                    t = i+j
                    ans.append(t)
            return ans 
        return helper(digits)

                