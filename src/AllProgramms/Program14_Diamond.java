package AllProgramms;

import java.util.Scanner;

/*
Write a program in Java to display the pattern like a diamond. While loop
 */
public class Program14_Diamond
{
    //printDiamond method
    public static void printDiamond(int r, char ch)
    {
        int i = 1;
        int j;
        while (i <= r) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i++;
        }
        i = r - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i--;
        }
    }

    //main method
    public static void main(String[] args) {
        //Scanner declaration
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the Number of row : ");
        int a = sn.nextInt();
        System.out.print("Enter the symbol : ");
        char c = sn.next().charAt(0);
        printDiamond(a, c);

        sn.close();
    }
}