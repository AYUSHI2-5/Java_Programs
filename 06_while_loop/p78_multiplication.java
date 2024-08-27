
import java.util.Scanner;

public class p78_multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int m=1;
        int i=1;
        while(i<=n){
            System.out.println(+i);
            m*=i;
            i++;

        }
        System.out.println("multiplication of numbers are=" +m);
       
    }
    
}
