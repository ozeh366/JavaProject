package javaPart3;

public class Inheritance extends Overloading{

    int a;
    int x;

    void print(int a, int x){
        System.out.println(a+x);
    }

static class A extends Inheritance{
        String luxio = "coming";

        void getText(){
            System.out.println(luxio);
        }
}

    public static void main(String[] args) {
        /*
        Inheritance aob = new Inheritance();
        aob.print(10,20);
        aob.sum(10,34,2);
        */
        A nw = new A();
        nw.print(10,29);
        nw.sum(2,3);
        nw.getText();
    }



}