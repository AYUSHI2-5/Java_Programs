
import java.util.Scanner;

public class p50_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println();
            System.out.print(n+"x" );
            System.out.print(i+"=" );
            System.out.print(+n*i );

        
        }
    }
    
}
