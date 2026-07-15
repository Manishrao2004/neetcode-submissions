class Node{
    int key;
    int value;
    Node prev;
    Node next;
    Node(int key, int value){
        this.key=key;
        this.value=value;
        this.prev=null;
        this.next=null;
    }
}

class LRUCache {
    int capacity;
    Node front;
    Node rear;
    HashMap<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map= new HashMap<>();
        front = new Node(-1,-1);
        rear= new Node(-1,-1);
        front.next=rear;
        rear.prev=front;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
            return -1;

        Node node = map.get(key);
        node.next.prev=node.prev;
        node.prev.next=node.next;

        node.next=rear;
        node.prev=rear.prev;
        rear.prev=node;
        node.prev.next=node;

        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;

            node.next.prev=node.prev;
            node.prev.next=node.next;

            node.next=rear;
            node.prev=rear.prev;
            rear.prev=node;
            node.prev.next=node;
        }
        else{
            if(map.size()<capacity){
                Node node = new Node(key,value);
                node.next=rear;
                node.prev=rear.prev;
                rear.prev=node;
                node.prev.next=node;
                map.put(key,node);
            }
            else{
                Node node = front.next;
                node.next.prev=front;
                node.prev.next=node.next;
                map.remove(node.key);

                node = new Node(key,value);
                node.next=rear;
                node.prev=rear.prev;
                rear.prev=node;
                node.prev.next=node;
                map.put(key,node);
            }
        }
    }
}
