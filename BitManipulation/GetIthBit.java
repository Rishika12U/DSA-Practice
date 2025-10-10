class Solution {
    public boolean checkIthBit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0)return false;
        return true;
    }
}
