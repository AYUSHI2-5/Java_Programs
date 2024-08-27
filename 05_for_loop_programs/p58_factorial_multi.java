
import java.util.Scanner;

public class p58_factorial_multi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int m=1;
        int c=0;
        for(int i=1;i<=n;i++){
            System.out.print("x"+i);
            m*=i;
            c++;



        }
        System.out.println();
        System.out.println("multiplication==" +m);
        
        System.out.println("count of numbers==" +c);
    }
    
}
