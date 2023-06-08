public class FindingTrue{
    public static void main(String[] args) {
        int[] arr = {1,3,8,5,7};
        int count=0;
        for (int i = 0; i <=arr.length;)
         {
            for (int j = 1; j < arr.length;) {
                if(arr[i]>arr[j]&&count>1){
                System.out.println("False");
                }
                else{
                    i++;
                    j++;
                }
                
            }
            // if(arr[i]>arr[i+1]){
            //     count++;
            // }
        }
    }
}