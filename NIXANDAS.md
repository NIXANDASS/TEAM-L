#LEETCODE:50
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
```
class Solution {
    public double power(double x,long n){
        if(x==0)
        return 0;
        if(n==0)
        return 1;
        if(n<0)
        return 1.0/power(x,-n);
        if(n%2==0){
            return power(x*x,n/2);
        }else{
            return x*power(x*x,(n-1)/2);
        }
    }
    public double myPow(double x, int n) {
        double res=power(x,(long)n);
        return res;
    }
}
```
