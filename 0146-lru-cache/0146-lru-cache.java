class LRUCache {
    class Node
    {
        int key;
        int val;
        Node prev;
        Node next;
        Node(int key, int val)
        {
            this.key = key;
            this.val = val;
        }
    }
        Node head = new Node(-1, -1);
        Node tail = new Node(-1, -1);
        int cap;
        HashMap<Integer, Node> m = new HashMap<>();
    

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev= head;
        
    }
	
    private void addNode(Node newnode) {	
        Node temp = head.next;	
        newnode.next = temp;	
        newnode.prev = head;	
        head.next = newnode;	
        temp.prev = newnode;	
    }
    private void deletenode(Node nnode)
    {
        Node prevv= nnode.prev;
        Node nextt = nnode.next;
        prevv.next = nextt;
        nextt.prev= prevv;
    }
    
    public int get(int key) {
        if (m.containsKey(key))
        {
            Node n = m.get(key);
            int ans = n.val;
            m.remove(key);
            
            deletenode(n);
            addNode(n);
            m.put(key, head.next);
            return ans;
        }
        return -1;
        
    }
    
public void put(int key, int value) {	
        if (m.containsKey(key)) {	
            Node curr = m.get(key);	
            	
            deletenode(curr);	
            m.remove(key);
        }	
        if (m.size() == cap) {	
            m.remove(tail.prev.key);	
            deletenode(tail.prev);	
            
        }
        addNode(new Node(key, value));
        m.put(key, head.next);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */