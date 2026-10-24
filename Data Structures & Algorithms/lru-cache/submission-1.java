class LRUCache {

Map<Integer, Node>map;

class Node{
    int key;
    int value;

    Node prev;
    Node next;

    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}
int capacity;
Node head;
Node tail;
public LRUCache(int capacity){

    this.capacity = capacity;
    map = new HashMap<>();
    head = new Node(-1, -1);
    tail = new Node(-1,-1);

    head.next = tail;
    tail.prev = head;

}
public void deleteNode(Node node){
    node.prev.next = node.next;
    node.next.prev = node.prev;
}

public void insertAtFront(Node node){
    node.next = head.next;
    node.prev = head;

    head.next.prev = node;
    head.next = node;

   }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node node = map.get(key);
        deleteNode(node);
        insertAtFront(node);

        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
       
            deleteNode(node);
            insertAtFront(node);
            return;
        }

        if(map.size() == capacity){
            Node lru = tail.prev;
             deleteNode(lru);
             map.remove(lru.key);
        }

        Node node = new Node(key, value);
        insertAtFront(node);
        map.put(key, node);


        
    }
}
