
import java.util.Scanner;

public class p131_even_odd {
    public static void printEvenOdd(int a){
        
        if(a%2==0){
            System.out.println("it is even number");
            return;
        }
        else{
            System.out.println("it is odd number");
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        printEvenOdd(a);



    }
    
}
