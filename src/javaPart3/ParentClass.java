package javaPart3;

public class ParentClass {
    int a;
    void showValues(){
        System.out.println(a);
    }

static class Child1 extends ParentClass{
        int x;
        void show(){
            System.out.println(x);
        }

class Child2 extends ParentClass {
    int y;
    void println() {
        System.out.println(y);
    }

    class Child3 extends ParentClass {
        int o;
        void values() {
            System.out.println(o);
        }
}}}

    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        obj1.showValues();
        obj1.show();

    }
}

