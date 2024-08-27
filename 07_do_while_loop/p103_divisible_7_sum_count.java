import java.util.Scanner;

public class p103_divisible_7_sum_count {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your limit");
    int n=sc.nextInt();
    int s=0;
    int c=0;
    int i=1;
    do{
    if(i%7==0){
    System.out.println(+i);
    s+=i;
    c++;
            
    }
    i++;
           
    } while(i<=n);
    System.out.println("sum of numbers are==" +s);
    System.out.println("count of numbers are==" +c);
    }
    
}
