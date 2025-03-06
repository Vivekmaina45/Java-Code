import java.util.*;

public class arraystring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arr[] = new String[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();

        }
        System.out.println(Arrays.toString(arr));

        arr[1] = "Ravi";
        System.out.println(Arrays.toString(arr));
    }

}