import java.util.Scanner;

public class p106_factorial_sum_count {
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i=1;
        int s=0;
        int c=0;
      
        do{
            System.out.print(+i+"x");
            i++;
           s+=i;
           c++;
        }while(i<=n);
        
        System.out.println("");
        System.out.println("sum of numbers=" +s);
        System.out.println("count of numbers=" +c);
    }
   
    
}
