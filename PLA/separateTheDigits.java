// segregate all the 0's in the left and all the right at the right;

import java.util.*;
public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
