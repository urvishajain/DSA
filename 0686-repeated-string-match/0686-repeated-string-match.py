class Solution:
    def repeatedStringMatch(self, a: str, b: str) -> int:
        k = len(b)
        q = k//len(a)
        p = a*(q+2)
        if b not in p:
            return -1
        if b in a*(q):
            return q
        elif b in (a*(q+1)):
            return q+1
        else:
            return q+2
            