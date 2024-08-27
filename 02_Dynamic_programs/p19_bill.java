
import java.util.Scanner;

public class p19_bill {
 public static void main(String[] args){
    System.out.println("HERE IS YOUR BILL");
    Scanner sc=new Scanner(System.in);
    int pizza=100;
    int maggie=20;
    int chips=20;
    System.out.println("ENTER QUANTITY FOR PIZZA=");
    int qty1=sc.nextInt();
    System.out.println("ENTER QUANTITY FOR MAGGIE=");
    int qty2=sc.nextInt();
    System.out.println("ENTER QUANTITY FOR CHIPS=");
    int qty=sc.nextInt();
    int total=qty1*pizza+qty2*maggie+qty*chips;
    System.out.println("YOUR TOTAL BILL IS");
    System.out.println(total);

 }   
}
