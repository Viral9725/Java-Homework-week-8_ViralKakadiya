package AllProgramms;

import java.util.Scanner;

/*
15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *

 */
public class Program15_LeftAngleTriangle
{
        //PatternTriangle method
        public static void LeftTriangle(int x)
        {
            for (int i = 1; i <= x; i++)
            {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.print("\n");
            }
        }
        //main method
        public static void main(String[] args)
        {
            Scanner sn = new Scanner(System.in);
            System.out.println("Enter number of Rows:");
            int a = sn.nextInt();

            LeftTriangle(a);

            sn.close();
        }
}
