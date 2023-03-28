package AllProgramms;

/*
13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static
 */
public class Program13_SharedDigit {

    //hasSharedDigit method
    public static boolean hasSharedDigit(int first, int second)
    {
        if ((first >= 10 && first <= 99) && (second >= 10 && second <= 99)) {
            int firstNumberLastDigit = first % 10;
            int secondNumberLastDigit = second % 10;
            first /= 10;
            second /= 10;
            int firstNumberFirstDigit = first;
            int secondNumberFirstDigit = second;
            return ((firstNumberFirstDigit == secondNumberFirstDigit) ||
                    (firstNumberFirstDigit == secondNumberLastDigit) ||
                    (firstNumberLastDigit == secondNumberFirstDigit) ||
                    (firstNumberLastDigit == secondNumberLastDigit));
        }
        return false;
    }
    //main method
    public static void main(String[] args)
    {
        System.out.println("hasSharedDigit(12, 23) ::"+hasSharedDigit(12, 23));
        System.out.println("hasSharedDigit(9, 99) ::"+hasSharedDigit(9, 99));
        System.out.println("hasSharedDigit(15, 55) ::"+hasSharedDigit(15, 55));
    }
}