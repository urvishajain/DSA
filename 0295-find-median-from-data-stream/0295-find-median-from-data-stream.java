class MedianFinder {

    private PriorityQueue<Integer> maxHeap = null;
    private PriorityQueue<Integer> minHeap = null;
    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a,b) -> (b-a));
        minHeap = new PriorityQueue<>((a,b) -> (a-b));
        
        
    }
    
    public void addNum(int num) {
        if (minHeap.size()>0 && num>=minHeap.peek()) minHeap.offer(num);
        // else if (maxHeap.size()>0 && num<= maxHeap.peek()) maxHeap.offer(num);
        else maxHeap.offer(num);
        balancingHeaps();
        
    }
    
    public double findMedian() {
        if (maxHeap.size()>minHeap.size()) return maxHeap.peek();
        else if (minHeap.size()>maxHeap.size()) return minHeap.peek();
        else return (maxHeap.peek()+minHeap.peek())/2.0;
    }
    private void balancingHeaps()
    {
        int n = maxHeap.size();
        int m = minHeap.size();
        if (n>m && (n-m)>1)
        {
            minHeap.offer(maxHeap.poll());
        }
        else if (m>n && (m-n)>1)
        {
            maxHeap.offer(minHeap.poll());
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */