class LRUCache {
    int capacity = 0;
    LinkedHashMap<Integer, Integer> myMap = new LinkedHashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(myMap.containsKey(key)){
            int value = myMap.get(key);
             myMap.remove(key);
            myMap.put(key, value);
            return myMap.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(myMap.containsKey(key)){
            myMap.remove(key);
        }
        else if(myMap.size()==capacity){
           int oldkey= myMap.keySet().iterator().next();
           myMap.remove(oldkey);
        }
        myMap.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */