
//From the given array find the max (product diffrenece) from given array.

import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.*;
public class maxProductDifference {
    public static void main(String[] args) {
        int[] arr = {5,6,2,7,4};
        Arrays.sort(arr);
        int product = (arr[arr.length-1]*arr[arr.length-2])-(arr[0]*arr[1]);
        System.out.println(product);
        
    }
}
