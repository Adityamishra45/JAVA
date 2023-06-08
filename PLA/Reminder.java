// - - 8/6/23


public class Reminder{
    public static void main(String[] args) {
        int num = 1234;
        int[] arr = new int[4];
        
        while(num>0){
            for (int i = 0; i <= arr.length; i++) {
                arr[i]=rem;
            }
            int reminder = num%10;
            int newNum = num/10;
            rem = reminder;
            num++;
        }
    }
}