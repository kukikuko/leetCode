class Solution {
    public int[] plusOne(int[] digits) {
        
        int length = digits.length;
        
        for(int i = length - 1; i >= 0; i--) {
            digits[i]++;
            
            if(digits[i] < 10) {
                return digits;
            } 
            
            digits[i] = 0;
        }
        
        
        int[] list = new int[length + 1];
        list[0] = 1;
        
        
        return list;
        
    }
}