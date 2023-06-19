//Take the array size as 6 and sort the arrays using the sort the function. 
//Then print the largest element with thw smallest element and second largest witn the 
//second lower and  so on.

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class hello{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the size of the array : ");
        int n = sc.nextInt();
        int[]arr = new int[n];  
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        array(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length;
        int mid = start+(end-start)/2;
        int j = arr.length-1;
        if(n%2 !=0){
            for(int i=0; i<mid;i++){
                int [] newarr = new int[2];
                newarr[0] = arr[i];
                newarr[1] = arr[j];
                j--;
                 System.out.println(Arrays.toString(newarr));
            }
            int yeet[] = new int[2];
            yeet[0] = arr[mid];
            yeet[1] = 0;
            System.out.println(Arrays.toString(yeet));
        }
        else{
            for(int i=0; i<mid;i++){
            int [] newarr = new int[2];
            newarr[0] = arr[i];
            newarr[1] = arr[j];
            j--;
            System.out.println(Arrays.toString(newarr));
        }
    }
        
    }
    static void array(int[] arr){
        for(int i=0;i<arr.length; i++){
            // int min = 0;
            for(int j=1; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                }
            }
            
        }
    }
}
