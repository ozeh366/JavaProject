package javaPart1;

public class Loop {

    public static void main(String[] args) {
        /*
        int x = 1;

        while (x<=10)
        {
            System.out.println(x);
            x++; //increment by 1
        }


        //Even numbers btw 1-10
        int i=2; //initialization of the value

        while(i <= 10)// condition
        {
            System.out.println(i); //statement
            i+=2; //or i=i+2; //inc/dec
        }



        //ODD numbers btw 1-10
        int a=1;

        while(a <= 10)
        {
            System.out.println(a);
            a+=2; //or a=i+2;
        }

        //Print 1 to 10 in descending order
       int s = 10;

        while (s>0){
            System.out.println(s);
            s--;
        }

        //Do while loop
        int i=1;
        do
        {
            System.out.println(i);
            i++;
        }while (i<=10);
            {
        }

        //For Loop
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        //Jumping Statement BREAK
        for(int i=1;i<=10;i++)
        {
                if(i==5)
            {
                System.out.println("break at 5");break;
            }
            System.out.println(i);
        }
        */
        //Jumping Statement CONTINUE/Skip
        for(int i=1;i<=10;i++)
        {
            if(i==3 || i==5 || i==7 || i==9)
            {
                System.out.println("skip odd #");continue;
            }
            System.out.println(i);
        }
    }
}
