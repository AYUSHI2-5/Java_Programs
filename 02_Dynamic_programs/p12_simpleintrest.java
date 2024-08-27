
import java.util.Scanner;

public class p12_simpleintrest {
    public static void main(String[] args) {
        System.out.println("SIMPLE INTREST");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for p==");
        int p=sc.nextInt();
        System.out.println("Enter value for r==");
        double r=sc.nextDouble();
        System.out.println("Enter value for t==");
        double t=sc.nextDouble();
        double sim=((p*r*t)/100);
        System.out.println("Simple intrest==");
        System.out.println(sim);

    }
}
