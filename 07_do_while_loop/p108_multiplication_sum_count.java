import java.util.Scanner;

public class p108_multiplication_sum_count {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int m=1;
        int i=1;
        
        int c=0;
        do{
            System.out.println(+i);
            m*=i;
            c++;
            i++;

        } while(i<=n);
        System.out.println("multiplication of numbers are=" +m);
        System.out.println("count of numbers are=" +c);
       
    }
    
}

    

