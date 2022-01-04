package javaPart1;

public class Operators {

    public static void main(String[] args) {
        //Arithmetic Operators
        int a = 4;
        int b = 5;
        int c = a+b;

        System.out.println("sum of a + b is: " + c);
        System.out.println("diff of a and b is: " + (b/a));
        System.out.println("multiplication of a and b is: " + (a*b));
        System.out.println("subtract a from b is: " + (b-a));
        System.out.println("Mod Div of a and b is: " +(a%b));

        //Relational Operators
        //Always return boolean value
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

        //Logical operators
        //Works between two boolean
        boolean x = true;
        boolean y = false;
        System.out.println("--------------------Logical Operators------------");
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);

        //Increment and Decrement operators
        a=10;
        b=20;
        a++;
        b--;

        System.out.println(a);
        System.out.println(b);

    }
}
