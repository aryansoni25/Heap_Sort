package org.studyeasy;

import java.util.HashMap;
import java.util.Map;

public class by {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"Aryan");
        m.put(2,"Aaditya");
        m.put(3,"Aishwary");
        System.out.println(m);
        m.put(2,"Anurag");
        System.out.println(m);
        m.remove(3);
        System.out.println(m);
        m.clear();
        System.out.println(m);
    }
}
