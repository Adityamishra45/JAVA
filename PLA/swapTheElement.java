//Array insertion at perticular position. Take the user input of length of the array and
//position of the new element then swap the previous number with the previous one.


import java.util.*;
public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = sc.nextInt();
        }
        System.out.println("Array before exchange : "+Arrays.toString(arr));
        System.out.println("Enter the new element : ");
        int newElement = sc.nextInt();
        System.out.println("Enter the position of the new element : ");
        int position = sc.nextInt();


        if(position>size){
            System.out.println("Invalid !!");
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==arr[position]){
                    arr[i]=newElement;
                }
            }
            System.out.println("Array After exchange : "+Arrays.toString(arr));
        }

    }
}
