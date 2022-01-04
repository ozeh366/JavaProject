package javaPart4;

public class CheckedExceptionError {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program in progress");

    /*
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
     */

        Thread.sleep(5000);

        System.out.println("Program has ended");
    }
}
