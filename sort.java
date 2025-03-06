public class sort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 8, 6, 2, 1 };
        System.out.println(sort1(arr));

    }

    static int sort1(int[] arr) {
        int[] temp ;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return temp;
    }

}
