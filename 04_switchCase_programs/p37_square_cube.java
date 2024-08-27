
import java.util.Scanner;

public class p37_square_cube {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("square and cube");
        System.out.println("enter any number");
        int a=sc.nextInt();
        int s=a*a;
        int c=a*a*a;
        System.out.println("select any button");
        int button=sc.nextInt();
        switch(button){
            case 1:
            System.out.println("square of a number is==" +s);
            break;
            case 2:
            System.out.println("cube of a number is==" +c);
            break;
            default :{
                System.out.println("not valid button");
            }
        }
        
    }
}
