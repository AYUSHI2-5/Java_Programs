
import java.util.Scanner;

public class p56_factorial_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int s=0;
        int c=0;
        for(int i=n;i>=1;i--){
            System.out.print("x"+i);
            s+=0;
            c++;
        }
        System.out.println();
        System.out.println("sum of factorials==" +s);
        System.out.println("count of factorials==" +c);
    }
    
}
