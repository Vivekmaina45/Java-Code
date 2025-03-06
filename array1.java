import java.util.*;

@SuppressWarnings("unused")
public class array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Array is:");
        int[] arr1 = new int[5];
        // arr1[0] = 54;
        // arr1[1] = 88;
        // arr1[2] = 554;
        // arr1[3] = 898;

        // int[] arr = { 5, 9, 3, 7, 9 };
        // System.out.println(arr);

        // String[] arr1 = new String[4];
        // String[] arr = { "Vivek", "Maina" };

        // System.out.println(arr1[2]);

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}