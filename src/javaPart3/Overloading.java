package javaPart3;

public class Overloading {

    void sum(int a, int b){
        System.out.println(a+b);}
    void sum(double a, int b){
        System.out.println(a+b);}
    void sum(double a, double b){
        System.out.println(a+b);}
    void sum(int a, int b, int c){
        System.out.println(a+b);}

    public static void main(String[] args) {
        Overloading ov = new Overloading();
        ov.sum(19, 20);
        ov.sum(1.7, 23);
        ov.sum(4.5, 2.3);
        ov.sum(5,6,6);
    }
/*
    Overloading(int a, int b){System.out.println(a+b);}
    Overloading(int a, double b){System.out.println(a+b);}
    Overloading(double a, int b){System.out.println(a+b);}
    Overloading(double a, double b){System.out.println(a+b);}
    Overloading(int a, int b, int c){System.out.println(a+b+c);}

    public static void main(String[] args) {
        Overloading ov = new Overloading(10, 1, 6);
    }
 */


}
