package javaPart3;

public class MethodOveriding {

    double rateofInterest(){
        return 0;
    }
}

class SBI extends MethodOveriding{
    double rateofInterest() {
        return 7;
    }
}

class AXI extends MethodOveriding{
    double rateofInterest() {
        return 4.8;
    }
}
class OverridingDemo{
    public static void main(String[] args) {

        SBI ne = new SBI();
        System.out.println(ne.rateofInterest());

        AXI n = new AXI();
        System.out.println(n.rateofInterest());

    }
}
