class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        boolean sign = true;

        if(dividend < 0 && divisor >= 0) sign = false;
        if(dividend >= 0 && divisor < 0) sign = false;
       
       long n = Math.abs((long)dividend);
       long d = Math.abs((long)divisor);
       long ans = 0;
       
     while(n >= d){
        int cnt = 0;
        while(n >= (d << (cnt+1))){
            cnt++;
        }
        ans += 1L << cnt;
            n = n - d*(1L << cnt);
     }

     if (ans > Integer.MAX_VALUE) {
    return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
}


     return  sign ? (int)ans:-1*(int)ans;
    }
}
