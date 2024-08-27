
import java.util.Scanner;

public class p73_sum_count_7 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your limit");
    int n=sc.nextInt();
    int s=0;
    int c=0;
    int i=1;
    while(i<=n){
    if(i%7==0){
    System.out.println(+i);
    s+=i;
    c++;
            
    }
    i++;
           
    }
    System.out.println("sum of numbers are==" +s);
    System.out.println("count of numbers are==" +c);
    }
    
}
