class Solution {
    public int fib(int n) {
        int fn = 0, fnm1 = 1, fnm2 = 0;
         if(n == 0 || n==1){
            return n;
        }
     for(int i = 2; i<=n ; i++){
        fn = fnm1 + fnm2;
        fnm2 = fnm1;
         fnm1 =fn;
        
     }
       return fn;
    }
}
