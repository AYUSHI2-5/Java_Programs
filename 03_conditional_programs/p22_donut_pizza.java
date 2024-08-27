
import java.util.Scanner;


public class p22_donut_pizza {
 public static void main(String[] args) {
     System.out.println("HOW MUCH MONEY DO YOU HAVE?");
     Scanner sc=new Scanner(System.in);
     int money=sc.nextInt();
     if(money<200){
        System.out.println("lets buy donut!");

     }
     else{
        System.out.println("lets buy pizza!");
     }
 } 
}