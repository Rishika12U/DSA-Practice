 public int[] swap(int a, int b) {
        
        int[] ans = new int[2];
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        ans[0] = a;
        ans[1] = b;
        return ans;
    }
}
