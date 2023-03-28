package AllProgramms;

import java.util.Scanner;

/*
9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Program9_FibonacciNumber {
    //isFibonacci method
    public static void isFibonacci(int count)
    {
        int n1 = 1, n2 = 1, n3;
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
    //Main method
    public static void main(String[] args) {
        //Scanner Declaration
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Any Fibonacci number:: ");
        isFibonacci(sn.nextInt());

        //closing the scanner
        sn.close();
    }
}
