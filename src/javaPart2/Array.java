package javaPart2;

public class Array {

    public static void main(String[] args) {

        //Single Dimensional Array
        /*
        int b[] = new int[3]; // declare array with size 3, starting index is 0 and last element is 2.

        // Insert values into the array
        b[0]= 100;
        b[1]= 105;
        b[2]= 109;
        //or
        //int a[]={100, 200, 300}; // declare an array without specifying the size

        //Length of Array
        System.out.println("length of an array is: " +a.length);

        // Read Specific values of array
        System.out.println(a[2]);

        //Get all values of the array
        for(int i=0;i<=a.length-1;i++)
        {
           System.out.println(a[i]);
        }

        //Get all values of the array using advanced for loop
        for (int i:a)
        {
            System.out.println(i);
        }
*/
        //Multi Dimensional Array
        //Declare the array
        int a[][]=new int [3][2];// 3 equals the number of rows and 2 is the number of columns in each row

        //Enter values to the array
        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        a[2][0]=500;
        a[2][1]=600;

       //int b[][]={ {100,200} , {300,450}, {456,334} }; //If you dont know the size of array

        //Find number of rows and columns
        System.out.println("Number of rows:" + a.length);
        System.out.println("Number of columns:" + a[0].length);

        //Read the values of the array
        //1. Classic For loop
        /*
        for(int i=0;i<a.length;i++) //outer loop for the rows
        {
            for(int j=0;j<a[i].length;j++)//inner loop for each column
            {
                System.out.println(a[i][j]);
            }
        }
        */

        //Enhanced For Loop
        for(int r[]:a)
        {
            for(int i:r)
            {
                System.out.println(i);
            }
        }
    }
}