class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>>pq = new PriorityQueue<>((a,b) -> Integer.compare(a.getValue(), b.getValue()));
        
        Map<Integer, Integer>hm = new HashMap();
        if (nums.length==0)
        {
            return new int[k];
        }
        for(int x:nums)
        {
           hm.put(x, hm.getOrDefault(x, 0)+1);
            
            
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            pq.add(entry);
            if(pq.size()>k) pq.poll();
        }
        int[] res = new int[k];
        int i=0;
        while(i<k)
        {
            Map.Entry<Integer, Integer> mp = pq.poll();
            res[i++] = mp.getKey();
        }
        return res;
        
        
        
    }
}