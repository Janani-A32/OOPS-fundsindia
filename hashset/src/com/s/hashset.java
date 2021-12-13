package com.s;
import java.util.*;

public class hashset {
    public static void main(String[] args)
    {
        Set<String> s=new HashSet<String>();
        s.add("python");
        s.add("c");
        s.add("Java");
        System.out.println(s);
        Set<String> a=new HashSet<String>();
        a.add("Datastructures");
        a.add("Union");
        System.out.println(a);
        a.addAll(s);
        System.out.println(a);

    }
}
