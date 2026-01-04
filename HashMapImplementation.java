import java.util.LinkedList;

public class HashMapImplementation {
    static class HashMap<K,V>{ //Generic types K and V
        private class Node{
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n; //n - nodes
        private int N; //N - buckets
        private LinkedList<Node> buckets[]; //Array of linked lists

        @SuppressWarnings("unchecked") //To suppress unchecked cast warning
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(); //Initialize each bucket with an empty linked list
            }
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            LinkedList<Node> bucket = buckets[bi]; 
            for (Node node : bucket) {
                if(node.key.equals(key)){ //Update value if key already exists
                    node.value = value;
                    return;
                }
            }
            Node newNode = new Node(key, value); //Create a new node and add it to the bucket
            bucket.add(newNode);
            n++;
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            LinkedList<Node> bucket = buckets[bi];
            for (Node node : bucket) {
                if(node.key.equals(key)){
                    return true;
                }
            }
            return false;
        }


        public V get(K key){
            int bi = hashFunction(key);
            LinkedList<Node> bucket = buckets[bi];
            for (Node node : bucket) {
                if(node.key.equals(key)){
                    return node.value;
                }
            }
            return null;
        }
        private int hashFunction(K key){
            int hashCode = key.hashCode();
            return Math.abs(hashCode) % N;
        }
        public int size(){
            return n;
        }
        public void print(){
            for (int i = 0; i < N; i++) {
                LinkedList<Node> bucket = buckets[i];
                System.out.print("Bucket " + i + ": ");
                for (Node node : bucket) {
                    System.out.print("[" + node.key + " : " + node.value + "] ");
                }
                System.out.println();
            }
        }
        public void remove(K key){
            int bi = hashFunction(key);
            LinkedList<Node> bucket = buckets[bi];
            Node toRemove = null;
            for (Node node : bucket) {
                if(node.key.equals(key)){
                    toRemove = node;
                    break;
                }
            }
            if(toRemove != null){
                bucket.remove(toRemove);
                n--;
            }
        }
        public void clear(){
            for (int i = 0; i < N; i++) {
                buckets[i].clear();
            }
            n = 0;
            N = 4;
            buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        public boolean isEmpty(){
            return n == 0;
        }

        public void resize(){
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;
            n = 0;
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

    }
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.print();
        System.out.println("Size: " + map.size());
        System.out.println("Get 'Two': " + map.get("Two"));
        System.out.println("Contains 'Three': " + map.containsKey("Three"));
        map.remove("Two");
        map.print();
        System.out.println("Size after removal: " + map.size());
        map.clear();
        System.out.println("Size after clear: " + map.size());
        System.out.println("Is empty: " + map.isEmpty());

    }
}
