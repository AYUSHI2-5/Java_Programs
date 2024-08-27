import java.util.Scanner;

public class p109_multiplication_factorials {
        public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i=1;
        int m=1;
      
        do{
            System.out.print(+i+"x");
           i++;
           m*=i;
        }while(i<=n);
        System.out.print("  " );
        System.out.println("multiplication of numbers are=" +m);
    }
    }
    


