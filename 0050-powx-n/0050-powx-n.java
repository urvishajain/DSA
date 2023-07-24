class Solution {
    public double myPow(double x, long n) {
        if (n==0) return 1;
        if(n==1) return x;
        if (x==0) return 0;
        int sign;
        if(n<0) 
        {
            sign = -1;
            n*=-1;
        }
        else sign =1;
        double a ;
        if (n%2==0)
        {
            a = myPow(x*x, n/2);
        }
        else
        {
            a = x* myPow(x*x, (n-1)/2);
        }
        
        if (sign<0) return 1/(a);
        else
            
        {
            return a;
        }
            
        
    }
}