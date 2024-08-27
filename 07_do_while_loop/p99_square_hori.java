import java.util.Scanner;

public class p99_square_hori {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i=1;
        do { 
            System.out.print(i+"="+i*i+" ");
            i++;
        } while (i<=n);
    }
    
    
}
