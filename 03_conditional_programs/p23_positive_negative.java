
import java.util.Scanner;

public class p23_positive_negative {
 public static void main(String[] args) {
     System.out.println("ENTER ANY NUMBER");
     Scanner sc=new Scanner(System.in);
     int number=sc.nextInt();
     if(number<0){
        System.out.println("number is negative");

     }
     else{

        System.out.println("number is positive");
     }
 }    
}
