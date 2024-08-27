
import java.util.Scanner;


public class p39_calculator {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("press 1 for addition");
    System.out.println("press 2 for diff");
    System.out.println("press 3 for multiplication");
    System.out.println("press 4 for division");
    System.out.println("Enter number 1");
    int n1=sc.nextInt();
    System.out.println("Enter number 2");
    int n2=sc.nextInt();
    System.out.println("select any button");
    int button=sc.nextInt();
    switch(button){
        case 1:
        System.out.println("add numbers");
        int add=n1+n2;
        System.out.println("addition==" +add);
        break;
        case 2:
        int diff= n1-n2;
        System.out.println("diff==" +diff);
        break;
        case 3:
        int multi=n1*n2;
        System.out.println("multiplication==" +multi);
        break;
        case 4:
        int div=n1/n2;
        System.out.println("division==" +div);
        break;
        default:
        System.out.println("not valid");
    }

    
}    
}
