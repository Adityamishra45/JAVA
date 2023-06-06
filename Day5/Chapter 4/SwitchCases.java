import java.util.Scanner;

public class SwitchCases{
    public static void main(String[] args) {
/*If-else-if ladder
        Scanner sc =  new Scanner (System.in);
        int age = sc.nextInt();
        if(age>56)
        {
            System.out.println("You are experienced.");
        }
        else if(age>40)
        {
            System.out.println("You are also experienced.");

        }
        else  {
            System.out.println("you are not experienced.");
        }*/

//Switch Cases :- 
        // Scanner sc = new Scanner (System.in);
        // int age = sc.nextInt();
        // switch(age){
        //     case 18 : 
        //         System.out.println("You are about to become an adult.");
        //         break;
        //     case 21:
        //         System.out.println("You are going to get Job.");
        //         break;
        //     case 60: 
        //         System.out.println("You are going to retire.");
        //         break;
        //     default : 
        //     System.out.println("Enjoy Your Life");
        // }
//Enhanced Switch Case :-
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        switch(age){
            case 18 ->System.out.println("You are about to become an adult.");
            case 21 ->System.out.println("You are going to get Job.");
            case 60 ->System.out.println("You are going to retire.");
            default ->System.out.println("Enjoy Your Life !!");
        }
    }
}