
import java.util.Scanner;



public class p86_print_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println(+i);
            i++;

        }while(i<=n);

    }
    
}
