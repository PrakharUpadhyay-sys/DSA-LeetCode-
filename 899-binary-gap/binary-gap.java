class Solution {
    public int binaryGap(int n) {
        int maxDist = 0;
        int lastPos = -1;
        int currPos = 0;
        
        while (n > 0) {
            if ((n & 1) == 1) {
                if (lastPos != -1) {
                    maxDist = Math.max(maxDist, currPos - lastPos);
                }
                lastPos = currPos;
            }
            currPos++;
            n >>= 1;
        }
        
        return maxDist;
    }
}