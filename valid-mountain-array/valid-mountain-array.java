class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean inc = true;
        if(arr.length < 3 || arr[0] >= arr[1] ) return false;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]) return false;
            if(inc == true && arr[i] > arr[i+1]) inc = false;
            if(inc == false && arr[i] < arr[i+1]) return false; 
        }
        if(inc) return false;
        
        return true;
    }
}