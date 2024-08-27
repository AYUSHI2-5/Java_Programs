
import java.util.Scanner;

public class p75_even_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int s=0;
        int c=0;
        int i=1;
        while(i<=n){
            if(i%2==0){
                System.out.println(+i);
                s+=i;
                c++;
            }
            i++;
        }
        System.out.println("sum and count of even numbers are="+s+","+c);
    }
    
}
