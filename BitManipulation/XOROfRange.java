public static int xorHelper(int n){
    if(n % 4 == 1) return 1;
    if(n % 4 == 2) return n+1;
    if(n % 4 == 3) return 0;
    if(n % 4 == 0) return n;
    return n;
}

    public int findRangeXOR(int l, int r) {
         int xor = xorHelper(l-1) ^ xorHelper(r);
         return xor;
    }
}
