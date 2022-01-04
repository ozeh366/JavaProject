package javaPart4;

interface ABC {
    int x = 100;
    void m2();
}

interface XYZ {
    int y = 190;
    void m3();
}

interface WED {
    int xy = 18;
    void m4();
}

public class MultipleInheritance implements XYZ, ABC, WED{

    @Override
    public void m2()
    {
    System.out.println(x);
    }

    @Override
    public void m3() {
        System.out.println(y);
    }

    @Override
    public void m4() {
        System.out.println(xy);
    }

    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        m.m2();
        m.m3();
        m.m4();
    }
}
