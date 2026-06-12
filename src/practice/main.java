package practice;

import java.util.*;

public class main {
    public static void main(String[] args) {

        Map<Integer, String> mm = new HashMap<>();

        mm.put(101, "Dhaka");
        mm.put(102, "Chittagong");
        mm.put(103, "Khulna");
        mm.put(104, "Rajshahi");

        System.out.println(mm);

        mm.remove(101);
        System.out.println(mm);

        // replace
        mm.put(104, "Sylhet");
        System.out.println(mm);
    }
}