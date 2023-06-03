import java.util.Scanner;
public class userInput{
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        // System.out.println("Enter Number 1: ");
        // int A = sc.nextInt();
        // System.out.println("Enter Number 2: ");
        // int B = sc.nextInt();
        // System.out.println("Sum of the numbers are : "+(A+B));
        // boolean b1 = sc.hasNextInt();    //will print the output whether the input is intger or not.
        // System.out.println(b1);

        String str = sc.nextLine();
        System.out.println(str);
        sc.close();
    }
}