class Solution {
public static long MOD = 1000000007;

public long myPow(long x, long n){
    if(n == 0){
        return 1;
    }
    x %= MOD;

    if(n % 2 == 0){
        return (myPow(x*x, n/2)) % MOD;
    }
    else{
        return (x*myPow(x*x, (n-1)/2) % MOD);
    }
}

    public int countGoodNumbers(long n) {
        long evenPositions = (n+1)/2;
        long oddPositions = n/2;
        long evenWay = myPow(5, evenPositions);
        long oddWay = myPow(4, oddPositions);

        return (int)((evenWay*oddWay) % MOD);
    }
}
