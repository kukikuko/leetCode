class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i = nums.length-1; i > -1; i--) {
            if(!list.contains(nums[i])) list.add(nums[i]);
        }
        
        
        if(list.size() < 3) return list.get(0);
        else return list.get(2);

    }
}