import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr = {1,2,5,3,0,8,13,12,18,17};
        int [] subarray = subArray(arr);
        System.out.println(Arrays.toString(subarray));
    }
    static int[] subArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]>arr[i+1] && arr[j]<arr[j-1]){
                return new int[]{i,j};
            }
            i++;
            j--;
        }
        return new int[] {0,0};
    }
}
