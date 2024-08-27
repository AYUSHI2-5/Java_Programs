
import java.util.Scanner;

public class p13_square_cube {
    public static void main(String[] args) {
        System.out.println("SQUARE AND CUBE");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER VALUE OF A FOR SQUARE==");
        int a=sc.nextInt();
        int square=a*a;
        System.out.println("ENTER VALUE OF B FOR CUBE==");
        int b=sc.nextInt();
        int cube=b*b*b;
        System.out.println("YOUR SQUARE IS===");
        System.out.println(square);
        System.out.println("YOUR CUBE IS==");
        System.err.println(cube);


    }
    
}
