
import java.util.Scanner;

public class p29_big_small_equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1=");
        int a=sc.nextInt();
        System.out.println("Enter number 2=");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(b>a){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("both are equal");
        }
    }
    
}
