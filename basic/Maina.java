
import java.util.Scanner;
public class Maina {
    public static void main(String[] args) {
    //     System.out.println("find the position:");
    //     Scanner s=new Scanner(System.in);
    //     int pos=s.nextInt();
    //     int a=0;
    //     int b=1;
    //     int c=2;
    //     while (c<=pos) {
    //         int temp = b;
    //         b=b+a;
    //         a=temp;
    //         c++;

            
    //     }
    //     System.out.println(b);
    // }
    System.out.println("Enter to  fruit name:");
    Scanner s=new Scanner(System.in);
    String fruit =s.next();
    // System.out.println("Enter to count number:");
    // int num =s.nextInt();
    // int count =0;
    // while(n>0){
    //     int rem =  n%10;
    //     if(rem == num){
    //         count++;
    //     }
    //     n=n/10;
    // }
    // System.out.println(count);

    // int r=0;
    // while(n>0){
    //     int rem =n%10;
    //     n/= 10;
    //     r =r*10+rem;
        
        
        

    // }
    
    
    // System.out.print(r);
    switch(fruit){
        case "mango"->System.out.println("King of fruits");
        case "apple" ->System.out.println("A sweet red fruit");
        case "Orange"->System.out.println("Round fruit");
        case "Grapes"->System.out.println("Small Fruit");
        default->System.out.println("Invalid Fruit");
    }


    }
    
}
