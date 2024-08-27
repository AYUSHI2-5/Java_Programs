
import java.util.Scanner;



public class p67_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+"x"+i+"="+i*n);
            i++;

        }
    }
    
}
