class NIXAN {
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