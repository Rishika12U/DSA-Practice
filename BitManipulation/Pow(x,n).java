class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long exp = n;
        if(exp < 0){
            x = 1.0/x;
           exp = -exp;
        }
        while(exp > 0){
            if((exp & 1) != 0){
            ans = ans * x;
            }
            x = x* x;
            exp = exp >> 1;
        }
        return ans;
    }
}
