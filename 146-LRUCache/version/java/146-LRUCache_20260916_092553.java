// Last updated: 9/16/2026, 9:25:53 AM
1class Node {
2     int key;
3    int val;
4    Node prev;
5    Node next;
6      public Node(int key, int val) {
7        this.key = key;
8        this.val = val;
9        this.prev = null;
10        this.next = null;
11    }
12}
13class LRUCache {
14
15    private int cap;
16    private Map<Integer, Node> cache;
17    private Node oldest;
18    private Node latest;
19
20    public LRUCache(int capacity) {
21        this.cap = capacity;
22        this.cache = new HashMap<>();
23        this.oldest = new Node(0, 0);
24        this.latest = new Node(0, 0);
25        this.oldest.next = this.latest;
26        this.latest.prev = this.oldest;
27    }
28    
29    public int get(int key) {
30          if (cache.containsKey(key)) {
31            Node node = cache.get(key);
32            remove(node);
33            insert(node);
34            return node.val;
35        }
36        return -1;
37    }
38     private void remove(Node node) {
39        Node prev = node.prev;
40        Node next = node.next;
41        prev.next = next;
42        next.prev = prev;
43    }
44
45    private void insert(Node node) {
46        Node prev = latest.prev;
47        Node next = latest;
48        prev.next = next.prev = node;
49        node.next = next;
50        node.prev = prev;
51    }
52    
53    public void put(int key, int value) {
54         if (cache.containsKey(key)) {
55            remove(cache.get(key));
56        }
57        Node newNode = new Node(key, value);
58        cache.put(key, newNode);
59        insert(newNode);
60
61        if (cache.size() > cap) {
62            Node lru = oldest.next;
63            remove(lru);
64            cache.remove(lru.key);
65        }
66    }
67}
68
69/**
70 * Your LRUCache object will be instantiated and called as such:
71 * LRUCache obj = new LRUCache(capacity);
72 * int param_1 = obj.get(key);
73 * obj.put(key,value);
74 */