package AllProgramms;

import java.util.Scanner;

/*
6. Write a program in Java to display the pattern like a triangle with a number.
 For eg.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910
 */
public class Program6_TrianglePattern
{
      //PatternTriangle method
    public static void PatternTriangle(int n)
    {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }
    //main method
    public static void main(String[] args)
        {
            Scanner sn = new Scanner(System.in);
            System.out.println("Enter number of Rows:");
            PatternTriangle(sn.nextInt());

            sn.close();
        }
}
