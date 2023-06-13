import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int t = number;
        int multiply = 1;
        int addition = 0;
        while(number>0){
            int rem = number%10;
            multiply = multiply*rem;
            addition = addition+rem;
            number /= 10;
        }
        int finalnumber = multiply+addition;
        if(t==finalnumber){
            System.out.println("It's a special number");
        }
        
    }
}
