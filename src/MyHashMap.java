import java.util.Arrays;

public class MyHashMap<K, V> {

    // node is a static class of MyHashMap,since it is:
    // very closely bonded to MyHashMap class
    // we probably need to access this class outside from MyHashMap class
    // if u wanna access this node , can use => MyHashMap.Node
    public static class Node<K, V> {
        final K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }


    //static final variable are global constants
    public static final int DEFAULT_CAPACITY = 16;
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private Node<K, V>[] array;
    private int size;
    private float loadFactor;

    public MyHashMap() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public MyHashMap(int cap, float loadFactor) {
        if (cap <= 0) {
            throw  new IllegalArgumentException("cap can not be <=0 ");
        }
        this.array = (Node<K, V>[]) (new Node[cap]);
        // create an array make it usable for generics
        this.size = 0;
        this.loadFactor = loadFactor;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size ==0;
    }

    public void clear() {
        Arrays.fill(this.array,null);
        size = 0;
    }

    //non-negative
    private int hash(K key){
        return key.hashCode()& 0X7FFFFFFF;
    }

    private int getIndex(K key) {
        return hash(key)% array.length;
    }

    private boolean equalValue(V v1, V v2){
        if(v1==null && v2 == null){
            return true;
        }
        if(v1 == null || v2 == null){
            return false;
        }
        return v1.equals(v2);
    }


    //O(n), traverse the whole array, and traverse each of the link list in the array
    public boolean containsValue(V value){
        if(isEmpty()){
            return false;
        }
        for (Node<K,V>node: array){
            while(node!= null){
                if(equalValue(node.value,value)){
                    return true;
                }
                node= node.next;
            }
        }
        return false;
    }

    private boolean equalsKey(K k1, K k2){
        if(k1 == null && k2 == null){
            return true;
        }
        if(k1 == null || k2 == null){
            return false;
        }
        return k1.equals(k2);
    }

    public boolean containsKey(K key) {
        int index  = getIndex(key);
        Node<K,V> node = array[index];
        while(node!=null){
            if(equalsKey(node.key, key)){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    // if key does node exists in the HashMap, return null
    public V get(K key) {
        int index = getIndex(key);
        Node<K,V> node = array[index];
        while(node!= null){
            if(equalsKey(node.key,key)){
                return node.value;
            }
            node= node.next;
        }
        return null;
    }

    //insert / update
    // if the key already exists, return the old corresponding value
    // if the key not exists , return null;
    public V put(K key, V value){
        int index = getIndex(key);
        Node<K,V> head = array[index];
        Node<K,V> node = head;
        while(node!=null){
            if(equalsKey(node.key,key)){
                V result = node.value;
                node.value = value;
                return result;
            }
            node = node.next;
        }
        Node<K,V> newNode = new Node(key,value);
        newNode.next = head;
        array[index] = newNode;
        size++;
        if(needRehashing()){
            rehashing();
        }
        return null;
    }

    private boolean needRehashing() {
        float ratio = (size + 0.0f)/ array.length;
        return ratio >= loadFactor;
    }

    private boolean rehashing() {
        // new double sized array
        // for each node in the old array
        // do the put() operation to the new larger array
        return true;
    }

    public V remove (K key) {
        // get index
        int index = getIndex(key);
        Node<K,V> head = array[index];
        Node<K,V> node = head;
        while (node != null){
            Node<K,V> next = node.next;
            if(equalsKey(node.key,key)){
                V result = node.value;
                array[index] = next;
                return result;
            }
            node = node.next;
        }
        size--;
        return null;
    }
}
