package javaPart4;

public class ArrayListDemo {

    public static void main(String[] args) {

        //How to declare an array list
       // ArrayListDemo list = new ArrayListDemo(); // we can store any type of element(s)
        //ArrayListDemo <Integer> list=ArrayListDemo <Integer>(); //to store integer data

        java.util.ArrayList<String> list=new java.util.ArrayList<String>(); //to store string data

        //Add values to array list
        list.add("Peter");
        list.add("David");
        list.add("Oga");
        list.add("Davido");

        //size of array list
        System.out.println(list.size());//4
        System.out.println("Before removing elements:" +list);

        //remove an element
        list.remove(2); // remove Oga
        System.out.println(list.size());//3
        System.out.println("After removing elements:" +list);

        //inserting a new element into array list
        list.add(1, "Tega");
        System.out.println(list.size());//4
        System.out.println("After inserting elements:" +list);

        //read values from array list using for loop
        for(String s:list)
        {
            System.out.println(s);
        }


    }
}
