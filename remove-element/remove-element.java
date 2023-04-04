class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                int temp = nums[cnt];
                nums[cnt] = nums[i];
                nums[i] = temp;
                cnt++;
            }
        }
        
        return cnt;
    }
}