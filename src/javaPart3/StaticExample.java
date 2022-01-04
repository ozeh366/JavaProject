package javaPart3;

public class StaticExample {

    static int a = 1; // static variable
    int b = 20; //non static variable

    static void m1(){
        System.out.println("this is m1 - static method");
} //static method
     void m2(){
        System.out.println("this is m2 - non static method");
    }

    void m3(){
        System.out.println("this is m3 - non static method");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }


    public static void main(String[] args) {
        //Static methods can access only static elements directly(without creating an object)
        System.out.println(a);
        m1();

        StaticExample se = new StaticExample();
        System.out.println(se.b); //non static variables
        se.m2(); //non-static method

        se.m3();

    }
}
