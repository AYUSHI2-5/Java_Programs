
import java.util.Scanner;

public class p55_divisiblity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        System.out.println("from which number you want to divide your number==");
        int n1=sc.nextInt();
        int s=0;
        int c=0;
        for(int i=1;i<=n;i++){
            if(i%n1==0){
                System.out.println(+i);
                s+=i;
                c++;
            }
        }
        System.out.println("sum of numbers are here==" +s);
        System.out.println("count of numbers are==" +c);
    }
    
}
