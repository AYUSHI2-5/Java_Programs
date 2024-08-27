
import java.util.Scanner;

public class p53_even_count_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int sum=0;
        int c=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(+i);
                sum+=i;
                c++;
            }
        }
        System.out.println("sum==" +sum);
        System.out.println("count of even numbers==" +c);
    }
    
}
