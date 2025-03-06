import java.util.*;

public class Fixedarray {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 8, 6, 9 },
                { 2, 9 },
                { 3, 4, 6 }
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

            }
            System.out.println(Arrays.toString(arr[row]));

        }
        System.out.println(arr[0][0]);
    }

}
