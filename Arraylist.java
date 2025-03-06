import java.util.*;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(256);
        // list.add(256);
        // list.add(256);
        // list.add(256);
        // list.add(256);
        // list.add(256);
        // list.add(256);
        // list.add(256);
        // list.add(256);

        // list.add(256);
        // list.add(256);
        // list.add(256);
        // list.add(256);
        // System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>(11);
        list.add(45);
         list.add(256);
        list.add(256);
         list.add(256);
         list.add(256);
        list.set(0,99);
        System.out.println(list);
        System.out.println(list.contains(44));
    }

}
