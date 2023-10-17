package homeworkweek6;

import java.util.Scanner;

/**
 * Created by Sandip Patel
 * convert the upper case to lower case
 */
public class Programme9_UpperAndLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String lowercaseString = convertUppercaseToLowercase(input);
        System.out.println("Converted string: " + lowercaseString);
        scanner.close();

    }

    public static String convertUppercaseToLowercase(String input) {
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (Character.isUpperCase(characters[i])){
            characters[i] = Character.toLowerCase(characters[i]);


        }
    }
   return new String(characters);

}
}
