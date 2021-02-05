package com.brighttechbits.hashmapinternal;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>(4,0.20f);
        hm.put("a","12");
        hm.put("b","12");
        hm.put("c","12");
        hm.put("d","12");
        hm.put("e","12");
        hm.put("f","12");


        TreeSet<Integer> nos = new TreeSet<>();
        nos.add(10);
        nos.add(17);

        System.out.println(nos);


        TreeSet<String> names = new TreeSet<>();
        names.add("Roshan");
        names.add("Madhu");
        names.add("Manish");
        names.add("Arnab");


        System.out.println(names);

    }
}
