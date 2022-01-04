package javaPart2;

public class EmployeeMain {

    public static void main(String[] args) {

        //By using reference variables
        Employee emp1 = new Employee();
        emp1.deptno = 101;
        emp1.sal = 200;
        emp1.deptName = "Lucio";
        emp1.display();
        emp1.getValues(200, 3, "Lucky");
        emp1.display1();

    }
}
