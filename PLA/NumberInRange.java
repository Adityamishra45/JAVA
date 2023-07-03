//Given a ranage m,n calculate the count of the numbers between them having only 1,4,9 as their digits.

import java.util.*;
public class Mainclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            int num = i;
            boolean hasOnly149 = true;

            while (num > 0) {
                int rem = num % 10;
                if (rem != 1 && rem != 4 && rem != 9) {
                    hasOnly149 = false;
                    break;
                }
                num = num / 10;
            }

            if (hasOnly149) {
                count++;
            }
        }

        System.out.println(count);
    }
}
