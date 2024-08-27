import java.util.Scanner;

public class p111_multiplication_reverse {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int m=1;
        int i=n;
        do{
            System.out.println(+i);
            m*=i;
            i--;

        } while(i>=1);
        System.out.println("multiplication of numbers are=" +m);
       
    }
}
