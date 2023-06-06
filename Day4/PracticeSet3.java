import java.util.Scanner;

public class PracticeSet3 {
    public static void main(String[] args) {
//1. Java program to convert user given string into lower case
        // Scanner sc  = new Scanner (System.in);
        // String str = sc.nextLine();
        // String newname = str.toLowerCase();
        // System.out.println(newname);

//2. Java program to replace space with underscore
        // String str = "Aditya Kumar Mishra";
        // String newName = str.replace(" ","_");
        // System.out.println(newName);

//3. Java program to detect double and triple space in the given string.
        // String str = "  Aditya  ";
        // System.out.println(str.indexOf("  "));
        // System.out.println(str.indexOf("   "));  //will return -1 because there is no tripple space.

//4. Java program to format the letter using escape sequence charecters.
        String str = "Hello Aditya how are you ??";
        System.out.println(str);
        str = "Hello\n\tAditya\nhow\nare\nyou ??";   // \t: will add a tab.
        System.out.println(str);
    }
}
