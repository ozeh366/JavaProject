package javaPart3;

public class SuperKeyword {

    String color = "red";
    void eating(){
        System.out.println("Eating");
    }

    SuperKeyword(){
        System.out.println("Animal is created");
}

static class Dog extends SuperKeyword{

    String color = "Black";

    void displayColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
    void eating(){
        System.out.println("Eating bread");
        super.eating();
    }
    Dog(){
        super();
        System.out.println("Dog is created");
    }

}
static class testKeyword extends SuperKeyword{
    public static void main(String[] args) {

        Dog d = new Dog();
       // d.displayColor();
       // d.eating();
    }

    }
}