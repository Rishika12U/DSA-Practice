class Solution {
    public int checkIthBit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0)return 0;
        return 1;
    }
}
