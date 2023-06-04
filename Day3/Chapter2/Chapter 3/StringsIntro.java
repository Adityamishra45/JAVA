import java.util.Scanner;

public class StringsIntro {
    public static void main(String[] args) {
        String name = new String("Aditya");
        System.out.println(name);

//User Input
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        System.out.println("Hello "+str);
        sc.close();
    }
}
