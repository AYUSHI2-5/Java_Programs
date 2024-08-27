
import java.util.Scanner;

public class p57_multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int m=1;
        int c=0;
        for(int i=1;i<=n;i++){
            System.out.println(+i);
            m*=i;
            c++;
        }
        System.out.println("multiplication==" +m);
        System.out.println("count of numebrs==" +c);
    }
    
}
