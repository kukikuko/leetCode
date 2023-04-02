class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(nums[i]) * Math.abs(nums[i]);
        }
        
        Arrays.sort(answer);
        return answer;
        
    }
}