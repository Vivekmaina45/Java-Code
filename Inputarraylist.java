import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Inputarraylist {
    public static void main(String [] args){

        ArrayList<Integer> list=new ArrayList<>(10);
        Scanner in=new Scanner(System.in);
        for(int i=0;i<=5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<=5;i++){
            System.out.println(list.get(i));
            
        }
        //System.out.println(list);
}
}
  

