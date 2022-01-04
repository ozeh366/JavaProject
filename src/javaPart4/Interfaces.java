package javaPart4;

interface A {

    int a = 10;// final and static variable

    void m1(); //Abstract Method, by default are public

        }


public class Interfaces implements A {
   //@verride
   public void m1(){
       System.out.println(a);
    }

    public static void main(String[] args) {
        /*Interfaces t = new Interfaces();
        t.m1(); */

        A tc = new Interfaces(); //Interface to create  the variable and a class for instantiation.
        tc.m1();

    }
}
