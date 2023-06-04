import java.util.Scanner;

public class PracticeSet2{
    public static void main(String[] args) {
        
// write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        
        //Encrypting
        // Scanner sc = new Scanner (System.in);
        // char grade = 'a';
        // grade = (char)(grade+8);
        // System.out.println(grade);

        //Decrypting
        // System.out.println((char)(grade-8));

// Use comparison operator to find out whether a given number is grater than the user entered number or not??

        Scanner sc = new Scanner (System.in);
        int number  = sc.nextInt();
        int no = 99;
        System.out.println(no>number);
    }
}