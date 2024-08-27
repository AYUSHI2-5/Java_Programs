
import java.util.Scanner;

public class p79_hori_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you limit");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(+i*i);
            i++;
        }
    }
    
}
