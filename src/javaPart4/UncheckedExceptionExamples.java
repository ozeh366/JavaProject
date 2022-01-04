package javaPart4;

public class UncheckedExceptionExamples {

    public static void main(String[] args) {

        System.out.println("Program is started");
        System.out.println("Program is in progress");

        int a = 100;
        String s = null;
        String x = "abc";


        try {
           System.out.println(a /0); // Throw Arithmetic Exception

           // System.out.println(s.length()); // NullPointerException

            int i=Integer.parseInt(x);// NumberformatException

        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch(NullPointerException e)
        {
            System.out.println("Entered into NullPointer catch block3");
        }
        catch(Exception e)
        {
            System.out.println("Entered into general catch block");
        }
        finally
        {
            System.out.println("Entered into caught it");
        }

        System.out.println("Program is completed");
        System.out.println("Program is excited");
    }
}
