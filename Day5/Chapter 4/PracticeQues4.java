import java.util.Scanner;
public class PracticeQues4 {
    public static void main(String[] args) {

//WAP to find whether the student is pass otr fail.
        // Scanner sc = new Scanner (System.in);
        // int totalSubject = sc.nextInt();
        // int total_marks = sc.nextInt();
        // int obtained_marks = sc.nextInt();
        // int percent  = obtained_marks/((totalSubject*total_marks)/100);
        // if(percent==40 || percent>=33){
        //     System.out.println("You're Passed.");
        // }
        // else{
        //     System.out.println("Better Luck Next Time.");
        // }

//2. WAP to calculate income tax paid by an employee to the goverment as per the slabs.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your Income : ");
        // int income = sc.nextInt();
        // if(income>=250000 && income<=500000)
        // {
        //     float tax = (income*5)/100;
        //     System.out.println(tax);
        // }
        // else if(income>=500001 && income<=1000000){
        //     float tax = (income*10)/100;
        //     System.out.println(tax);
        // }
        // else if(income>=1000000)
        // {
        //     float tax = (income*30)/100;
        //     System.out.println(tax);
        // }
        // else{
        //     System.out.println("No tax");
        // }

//3. Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
        // Scanner sc = new Scanner (System.in);
        // int day = sc.nextInt();
        // switch(day){
        //     case 1->System.out.println("Monday");
        //     case 2->System.out.println("Tuesday");
        //     case 3->System.out.println("Wednesday");
        //     case 4->System.out.println("Thursday");
        //     case 5->System.out.println("Friday");
        //     case 6->System.out.println("Saturday");
        //     case 7 ->System.out.println("Sunday");
        // }

//4. Write a Java program to find whether a year entered by the user is a leap year or not.
        // Scanner sc = new Scanner (System.in);
        // int year = sc.nextInt();
        // if(year%4==0)
        // {
        //     System.out.println("Leap Year");
        // }
        // else{
        //     System.out.println("Not a leap year");
        // }

//5. Write a program to find out the type of website from the URL:
        // .com – commercial website
        // .org – organization website
        // .in – Indian website

        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        if(url.endsWith(".com"))
        {
            System.out.println("Commercial Website.");  
        }
        else if(url.endsWith(".org")){
            System.out.println("Organization Website.");
        }
        else if(url.endsWith(".in")){
            System.out.println("Indian Website.");
        }
        else{
            System.out.println("What was that ??");
        }
    }
}
