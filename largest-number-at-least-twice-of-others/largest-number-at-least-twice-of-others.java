class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int answer = -1;
        
        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
                answer = i;
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] * 2 > max && answer != i) {
                return -1;
            }
        }
        
        return answer;
    }
}