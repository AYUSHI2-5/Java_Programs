import java.util.Scanner;

public class p104_even_count_sum {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int s=0;
        int c=0;
        int i=1;
        do{
            if(i%2==0){
                System.out.println(+i);
                s+=i;
                c++;
            }
            i++;
        } while(i<=n);
        System.out.println("sum and count of even numbers are="+s+","+c);
    }
    
}
    

