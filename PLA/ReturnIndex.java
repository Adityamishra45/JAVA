// in the ques given target = 5 and start =3 so find the (index-start).

public class ReturnIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 3;
        int target = 5;
        for (int i = 0; i <arr.length; i++) {
          if (arr[i]==target){
            System.out.println(i-start);
          }
        }
    }
}
