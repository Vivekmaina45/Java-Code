
import java.net.Socket;
import java.util.Scanner;


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Enter the integer:");
//         int num,i;
//         Scanner s = new Scanner(System.in);
//         num = s.nextInt();
//         for ( i = 1; i <= 10; i++) {
//             System.out.println(num + " X " + i + " = " + num*i );
//         }

        
//     }
    
// }


// import java.util.Scanner;

// import java.lang.classfile.AnnotationValue;

// public class Main{
//     public static void main(String[] args) {
//         System.out.println("Enter a nth Pattern:");
//         int n;
//         Scanner s = new Scanner(System.in);
//         n = s.nextInt();
//         int i,j;
//         for (i = 1; i <= n; i++) {
//             for(j=i;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }


// public class Main{
//     public static void main(String[] args) {
       
//         System.out.println("Enter a Salary:");
//         Scanner input = new Scanner(System.in);
        // float n =input.nextInt();
        // // float n=(float)(2648);
        // System.out.println("Roll no. is:"+n);
    //     byte b= 42;
    //     char c='a';
    //     short s=1024;
    //     int i=50000;
    //     float f=56.243f;
    //     double d= 0.25455;
    //     double result = (f*b)+(i/c)+(d*s);
    //     System.out.println((f*b)+" "+(i/c)+" "+(d*s));
    //     System.out.println(result);
//         int n=input.nextInt();
//         if(n>10000){
//             n=n+2000;

//         }else{
//             n=n+1000;
//         }
//         System.out.println("Salary is:"+n);
//     }
// }


//conditional loops

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fibonacci no.");
        int num= input.nextInt();
        int a=0;
        int b=1;
        int c=2;
        // for(int i=1;i<=num;i++)
        while(c<=num){
            
        
            c=(a+b);
            System.out.println(c);
            a=b;
            b = c;
        }


        
        System.out.println();
        }
     
    }
