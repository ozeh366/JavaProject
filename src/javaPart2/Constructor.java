package javaPart2;

public class Constructor {

    int x;
    int y;

    Constructor(){ //default constructor
        x = 10;
        y = 20;
    }
/*
    Constructor(int b, int c){ //Parameterized constructor
        x = b;
        y = c;
    }
*/
    void print(){
        System.out.println(x+y);
    }
    public static void main(String[] args) {

        Constructor cm = new Constructor();
        cm.x = 200;
        cm.y = 234;
        cm.print();

    }
}
