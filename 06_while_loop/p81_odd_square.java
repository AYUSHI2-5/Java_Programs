
import java.util.Scanner;

public class p81_odd_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i=1;
        int s=0;
        int c=0;
        while(i<=n){
            if(i%2==0){
                System.out.print(+i*i+"+");
                i++;
                s+=i;
                c++;
            }
            else{
                System.out.print(+i*i*i+"+");
                i++;
                s+=i;
                c++;
            }
        }
        System.out.println();
        System.out.println("sum of numbers are=" +s);
        System.out.println("count of numbers are=" +c);
    }
    
}
