class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] list = heights.clone();
        Arrays.sort(list);
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != list[i]) count++;
        }
        return count;
    }
}