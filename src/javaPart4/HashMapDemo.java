package javaPart4;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        //Declaration
       // HashMap hm=new HashMap();
        HashMap <Integer, String> hm=new HashMap<Integer, String>();

        //Adding pairs into hashmap
        hm.put(101, "Joe");
        hm.put(102, "John");
        hm.put(103, "Johnny");
        hm.put(104, "Johan");

        System.out.println(hm);

        //Remove a pair from hashmap
        hm.remove(103);
        System.out.println("After removing a pair:" +hm);

        //we cannot insert into hashmap because it doesn't have an index number

        //Read data from hashmap
        for (Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+"  "+m.getValue());
        }

    }
}
