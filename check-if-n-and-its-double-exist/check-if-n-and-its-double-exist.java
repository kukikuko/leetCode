class Solution {
    public boolean checkIfExist(int[] arr) {
      
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i] * 2;
            int a = i;
            int index = IntStream.range(0, arr.length).
                filter(j -> num == arr[j] && a != j).
                findFirst().orElse(-1);
            
            if(index >= 0) {
                return true;
            }
        }
        
        
        return false;
    }
}