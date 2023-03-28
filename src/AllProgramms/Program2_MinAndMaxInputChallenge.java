package AllProgramms;

import java.util.Scanner;

/*
-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */
public class Program2_MinAndMaxInputChallenge
{
    //Main method
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        int min = Integer.MAX_VALUE; //declaring Variable MAX
        int max = Integer.MIN_VALUE; //declaring Variable MAX

            //While Loop
            while (true)
            {
                System.out.print("Enter number: ");
                if (sn.hasNextInt()) {
                    int num = sn.nextInt();
                    if (num < min) {
                        min = num;
                    }
                    if (num > max) {
                        max = num;
                    }
                } else {
                    System.out.println("Invalid input Entered");
                    break;
                }
            }
            //invalid input Min and Max values only
            System.out.println("Minimum number entered: " + min);
            System.out.println("Maximum number entered: " + max);
        }
}