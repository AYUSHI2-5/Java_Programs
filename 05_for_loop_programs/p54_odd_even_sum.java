
import java.util.Scanner;

public class p54_odd_even_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit==");
        int n=sc.nextInt();
        int s=0;
        int s1=0;
        int c=0;
        int c1=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println("it is even number=="+i);
                s+=i;
                c++;
            }
            else{
                System.out.println("it is odd number=="+i);
                s1+=i;
                c1++;
            }
        }
        System.out.println("===================================================================");
        System.out.println("sum of even numbers==" +s);
        System.out.println("count of even numbers==" +c);
        System.out.println("sum of odd numbers==" +s1);
        System.out.println("count of odd numbers==" +c1);
    }
    
}
