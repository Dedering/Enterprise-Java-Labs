package com.enterprise.java.week2;

import java.util.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


/**
 * Practice working with JUnit by writing some test cases for the following interface:
 * 2. Map<K, V>
 * 2.1 V put(K key, V Value)
 * 2.2 V remove(K key)
 * 2.3 V get(K key)
 */
public class MapTestExercise {


    private Map<Integer, String> map = new HashMap<Integer, String>();

    @Test
    public void put(int key, String Value) {
        map.put(key, Value);
        //assertTrue(map);
    }

    @Test
    public void remove(int key) {
        map.remove(key);

    }

    @Test
    public void get(int key) {
        map.get(key);
    }

}
