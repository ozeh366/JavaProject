package javaPart4;

class A1 {
    void a1(){
        System.out.println("This is a class");
    }
}
interface B1 {
    int r = 190;
    void m00();
}

interface B2 {
    int xyz = 10;
    void m001();
}

public class HybridInheritance  extends A1 implements B1, B2 {
    @Override
    public void m00() {System.out.println("THIS IS AN iNTERFACE" + xyz);
    }

    @Override
    public void m001() {System.out.println("THIS IS ANOTHER iNTERFACE");}

    public static void main(String[] args) {
        HybridInheritance gh = new HybridInheritance();
        gh.m00();
        gh.m001();
        gh.a1();
    }


}
