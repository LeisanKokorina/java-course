package ru.itpark;

public class HashSet<V> {
    private HashMap<V, Object> map;
        Object object = new Object();



    public HashSet() {
        map = new HashMap<>();
    }

    public void add(V v) {
        map.put(v, object);
    }

    public void iterator(){

    }


}
