
import java.util.Scanner;

public class p132_table {
    public static void printTable(int a){
        for (int i = 1; i <= 10; i++) {
            System.out.println(a+"x"+i+"="+i*a);
            
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for which u want to print the table=");
        int a=sc.nextInt();
       
      printTable(a);
    }
    
}
