
import java.util.Scanner;

public class p21_area_triangle {
  public static void main(String[] args) {
      System.out.println("AREA OF TRIANGLE");
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER VALUE FOR L");
      double h=sc.nextDouble();
      System.out.println("ENTER VALUE FOR b");
      double b=sc.nextDouble();
      double area=(h*b*0.5);
      System.out.println(area);

  }  
}
