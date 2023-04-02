class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cnt = 0;
        for(int i : nums) {
            if(i != 0) cnt++;
            else {
                if(max <= cnt) max = cnt;
                cnt = 0;
            }
        }
        if(max <= cnt) max = cnt;
        return max;
    }
}