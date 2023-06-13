import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int a = number%10;
        number = number/10;
        int b = number%10;
        if(b%3==0){
            System.out.println("It's a trendy number.");
        }
        else{
            System.out.println("It's not a trendy number.");

        }
    }
}
