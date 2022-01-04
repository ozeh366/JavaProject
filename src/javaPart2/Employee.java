package javaPart2;

public class Employee {
    int sal;
    int deptno;
    String deptName;

    void display() {
        System.out.println(sal);
        System.out.println(deptno);
        System.out.println(deptName);
    }

    void getValues (int amount, int id, String name){
      int sal = amount;
      int deptno = id;
      String deptName = name;
    }

    void display1(){
        System.out.println(sal+" "+deptno+" "+deptName);
    }


}

