class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> d = new HashMap<>();
       int n = nums.length;
       for(int i =0; i<n ;i++){
           int s = target-nums[i];
           if (d.containsKey(s)){
               return new int[]{d.get(s),i};

           }
           d.put(nums[i],i);
       }

    return new int[]{};

    }
}