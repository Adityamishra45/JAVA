import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a =0, b =0, temp = number;
        while(temp >0){
            a = temp % 10;
            int fact = 1;
            for(int i = a; i > 1; i--){
                fact *= i;
            }
            b += fact;
            temp /= 10;
        }
        if ( b == number){
            System.out.println("Yeaa");
        }
        else{
            System.out.print("NOOOOooooooo.....");
        }
    }
}
