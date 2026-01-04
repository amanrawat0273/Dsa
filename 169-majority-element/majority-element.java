class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();

       int n=nums.length/2;
    
        for (int c : nums) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (freq.get(nums[i]) >n) {
                return nums[i];
            }
        }

        return -1;        
   

    }
}