package javaPart1;

public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 0;

        //Nested If

        if(age == 18)
        {
            System.out.println("Eligible to vote");
        }
        else if  (age >= 30)
        {
            System.out.println("too old");
        }
        else if (age < 30)
        {
            System.out.println("Nice try");
        }
        else
        {
            System.out.println("Not Eligible to vote");
        }

        //Switch Case
        int day = 9;

        switch(day){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default:System.out.println("Invalid Entry"); break;
        }
    }
}
