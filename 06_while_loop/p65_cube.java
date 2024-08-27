
import java.util.Scanner;



public class p65_cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i=0;
        while(i<=n){
            System.out.println(i+"="+i*i*i);
            i++;
        }
    }
    
}
