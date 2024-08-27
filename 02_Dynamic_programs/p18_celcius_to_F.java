
import java.util.Scanner;

public class p18_celcius_to_F {
   public static void main(String[] args) {
       System.out.println("CELCIUS TO FARENHIT");
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter celcius here");
       int c=sc.nextInt();
       int F=((c*9/5)+32);
       System.out.println(F);

   } 
}
