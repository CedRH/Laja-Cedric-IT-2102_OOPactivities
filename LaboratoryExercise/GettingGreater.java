import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Getting the Greater Value");

        System.out.print("Enter first character: ");
        char firstChar = cin.next().charAt(0);

        System.out.print("Enter second character: ");
        char secondChar = cin.next().charAt(0);

        int asciiFirst = (int) firstChar;
        int asciiSecond = (int) secondChar;
        char greaterChar;

        if (asciiFirst > asciiSecond) {
            greaterChar = firstChar;
        }
        else {
            greaterChar = secondChar;
        }

        System.out.println("----------------------------------------------");
        System.out.println("The character with the greater value is: " + greaterChar);
        System.out.println("----------------------------------------------");
        System.out.println("Showing the ASCII Codes");
        System.out.println(firstChar + ": " + asciiFirst);
        System.out.println(secondChar + ": " + asciiSecond);

        cin.close();
    }
}