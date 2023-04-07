class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] temp = new int[nums.length + 1];
        
        for(int i : nums) {
            temp[i] = i;
        }
        
        for(int i = 1; i < temp.length; i++) {
            if(temp[i] == 0) list.add(i);
        }
        
        return list;
    }
}