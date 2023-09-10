class Solution:
    def countOrders(self, n: int) -> int:
        if n==1:
            return 1
        elif n == 2:
            return  6
        else:
            return ((self.countOrders(n-1) * (2*n)  * ((2*n)-1))//2)%1000000007
            
        