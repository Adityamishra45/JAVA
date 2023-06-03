//Program to calculate the percentage.

import java.util.*;
public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the marks of subject 1: ");
        float a = sc.nextInt();
        System.out.println("Enter the marks of subject 2: ");
        float b = sc.nextInt();
        System.out.println("Enter the marks of subject 3: ");
        float c = sc.nextInt();
        System.out.println("Enter the marks of subject 4: ");
        float d = sc.nextInt();
        System.out.println("Enter the marks of subject 5: ");
        float e = sc.nextInt();

        float totalMark = a+b+c+d+e;
        System.out.println("The total percentage of the student is : " +totalMark/5);
    }
}
