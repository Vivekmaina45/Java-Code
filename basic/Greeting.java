
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        int ans = greeting2();
        System.out.println(ans);

        int sum22 = sum2(40, 50);
        {
            System.out.println(sum22);
        }

    }

    static int sum2(int a, int b) {
        int sum21 = a + b;
        return sum21;

    }

    static int greeting2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1 = in.nextInt();
        System.out.println("Enter a second no.:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }

}
