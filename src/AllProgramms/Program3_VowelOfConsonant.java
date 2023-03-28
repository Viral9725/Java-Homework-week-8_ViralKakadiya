package AllProgramms;

import java.util.Scanner;

/*
3. Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
 Input an alphabet: p
 Expected Output:
 Input letter is Consonant
 */
public class Program3_VowelOfConsonant {

    //main method
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter any Letter: ");
        String letter = sn.next().toLowerCase();

        //if Else Logic

        if (letter.length() != 1 || !Character.isLetter(letter.charAt(0))) {
            System.out.println("it's invalid letter,Please enter single letter only");
        }
        else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
        {
            System.out.println("Input Type is Vowel");
        }
        else
        {
            System.out.println("Input Letter is Consonant");
        }
    }
}