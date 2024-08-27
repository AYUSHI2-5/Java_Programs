
import java.util.Scanner;

public class p20_area_circle {
   public static void main(String[] args) {
       System.out.println("AREA OF CIRCLE");
       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER VALUE FOR RADIUS");
       double r=sc.nextInt();
       double area=r*r*3.14;
       System.out.println(area);
   } 
}
