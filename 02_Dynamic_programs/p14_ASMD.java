
import java.util.Scanner;

public class p14_ASMD {
    public static void main(String[] args) {
        System.out.println("....ASMD....");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1==");
        int n1=sc.nextInt();
        System.out.println("Enter number 2");
        int n2=sc.nextInt();
        int sum=n1+n2;
        int diff=n1-n2;
        int multi=n1*n2;
        int div=n1/n2;
        System.out.println("ADDITION OF NUMBERS");
        System.out.println(sum);
        System.out.println("DIFFERENCE OF NUMBERS");
        System.out.println(diff);
        System.out.println("MULTIPICATION OF NUMBERS");
        System.out.println(multi);
        System.out.println("DIVISION OF NUMBERS");
        System.out.println(div);
    }
}
