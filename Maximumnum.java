import java.util.*;

public class Maximumnum {
    public static void main(String[] args) {
        /* Scanner in= new Scanner(System.in); */
        // ArrayList<Integer> list=new ArrayList<>();
        // max(int i1,int i2);
        int[] arr = { 8, 9, 5, 4, 7, 6 };
        System.out.println(max(arr));

    }

    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;

    }

}
