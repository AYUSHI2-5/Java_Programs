
import java.util.Scanner;

public class p40_square_cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("press 1 for square");
        System.out.println("pres 2 for cube");
        System.out.println("press 3 for max");
       
        System.out.println("select any button");
        int Button=sc.nextInt();
        switch(Button){
            case 1:
            System.out.println("Enter number 1");
            int n1=sc.nextInt();
           int s=n1*n1;
           System.out.println("square of number==" +s);
           break;
           case 2:
           System.out.println("Enter number 1");
            int n2=sc.nextInt();
            int c=n2*n2*n2;
            System.out.println("cube of number==" +c);
            break;
            case 3:
            System.out.println("max");
            System.out.println("Enter number 1");
            int no1=sc.nextInt();
            System.out.println("Enter number 2");
            int no2=sc.nextInt();
            if(no1>no2){
                System.out.println("n1 is greater than n2");
            }
            else{
                System.out.println("n2 is greater than n1");
            }
           

        }
    }
    
}
