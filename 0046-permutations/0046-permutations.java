class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        backtrack(ret, nums, new ArrayList<>(), new HashSet<>());
        return ret;
        
            
        
        
    }
    private void backtrack(List<List<Integer>> ret, int[] nums, List<Integer> temlist, Set<Integer> tempSet)
        
    {
        
        if (temlist.size() == nums.length)
        {
            ret.add(new ArrayList<>(new ArrayList<>(temlist)));
            return;
                
        }
        for(int i =0;i<nums.length;i++)
        {
            if (tempSet.contains(nums[i])) continue;
            temlist.add(nums[i]);
            tempSet.add(nums[i]);
            backtrack(ret, nums, temlist, tempSet);
            tempSet.remove(temlist.get(temlist.size()-1));
            temlist.remove(temlist.size()-1);
            
                
        }
    }
}