package javaPart1;

import java.util.Scanner;

public class Part1Assignment {

    public static void main(String[] args) {
        /*
        //write a java program to check if a number is positive or negative
        var scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int userinput = scanner.nextInt();

        if (userinput > 0){
            System.out.println("You entered positive number");
        }
        else
        {
            System.out.println("You entered a negative number");

        //2. Write a java program to check the greatest of three numbers
            int n;
            var sc=new Scanner(System.in);
            System.out.print("Enter the number of elements you want to store: ");

        //reading the number of elements from the that we want to enter
            n=sc.nextInt();

        //creates an array in the memory.
            int[] array = new int[n];
            System.out.println("Enter the elements of the array: ");

            for(int i=0; i<n; i++)
           {
        //reading array elements from the user
               array[i]=sc.nextInt();
            }
            int size = array.length;
            Arrays.sort(array);
            System.out.println("sorted Array ::"+ Arrays.toString(array));
            n = array[size - 1];
            System.out.println("largest element is ::" + n);

        //3. Generate a multiplication table
        int num = 5;
        for(int i=0; i<12; i++){
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        */
        //4. Count the number of digits of a number
        var number =new Scanner(System.in);
        System.out.print("Enter the number to count: ");

        int count = 0, x = number.nextInt();

        while (x != 0) {
            x /= 10;
            ++count;
        }
            System.out.println("Number of digits entered: " + count);
        }
    }
