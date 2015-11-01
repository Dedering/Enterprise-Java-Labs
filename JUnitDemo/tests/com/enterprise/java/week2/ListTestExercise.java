package com.enterprise.java.week2;

import org.junit.After;

import java.util.*;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Practice working with JUnit by writing some test cases for the following interface:
 * 1. List<E>
 * 1.1 void insert(int index, E e)
 * 1.2 void remove(int index)
 * 1.3 void get(int index)
 */

public class ListTestExercise {
    List<String> list = null;
    @Before
    public void setup() {
        list = new ArrayList<String>();

    }

    // run w/ coverage, right click method

    @Test
    public void insert() {
        list.add(0, "test");
        assertEquals(1, list.size());
    }

    @Test
    public void remove() {
        list.add(0, "test");
        list.remove(0);
        assertEquals(0, list.size());
    }

    @Test
    public void get() {
        list.add(0, "test");
        assertEquals("test", list.get(0));
    }





}
