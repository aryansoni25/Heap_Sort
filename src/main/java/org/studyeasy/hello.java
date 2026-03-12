package org.studyeasy;
import java.util.*;

public class hello {
    public static void main(String[] args) {
        Set<String>  s1=new HashSet<>();
        s1.add("A");
        s1.add("B");
        s1.add("C");
        System.out.println(s1);
        System.out.println(s1.contains("D"));
        s1.remove("C");
        System.out.println(s1);
        System.out.println(s1.size());
    }
}
