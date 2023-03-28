package AllProgramms;

import java.util.Scanner;

/*
Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 */
public class Program8_RightAngleTriangle {

 public static void Triangle(int n) {
     for (int i = 0; i <= n; i++) {
         for (int j = 0; j < i; j++) {
             System.out.print("@");
         }
         System.out.println("");
     }
 }
    //Main method
    public static void main(String[] args)
    {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        Triangle(scanner.nextInt());
        // closing the scanner object
        scanner.close();
    }
}