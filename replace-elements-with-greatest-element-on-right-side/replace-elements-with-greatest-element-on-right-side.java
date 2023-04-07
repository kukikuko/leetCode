class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max = 0;
        int pre = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i = arr.length-2; i > -1; i--) {
            max = Math.max(pre, max);
            pre = arr[i];
            arr[i] = max;
        }
        return arr;
    }
}