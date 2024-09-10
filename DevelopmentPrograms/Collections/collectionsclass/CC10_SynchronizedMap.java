package com.evergent.CoreJava.Collections.collectionsclass;

import java.util.*;
/*
 *Create a HashMap: A regular HashMap is created to store key-value pairs.
Synchronize the HashMap: The Collections.synchronizedMap method is used to create a 
synchronized view of the HashMap. This ensures that all operations on the map are
 thread-safe.
Access and modify the synchronized map: You can access and modify elements in the 
synchronized map using standard Map operations like put and get.
Iterate over the synchronized map: You can iterate over the entries in the
 synchronized map using a for-each loop.
 */
public class CC10_SynchronizedMap {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);

        // Synchronize the HashMap
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(map);

        // Access and modify the synchronized map
        synchronizedMap.put("orange", 30);
        System.out.println(synchronizedMap.get("apple"));

        // Iterate over the synchronized map
        for (Map.Entry<String, Integer> entry : synchronizedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}