
import java.util.Scanner;

public class p41_billing_fooditems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("press 1 for dosa $30");
        System.out.println("press 2 for pizza $35");
        System.out.println("press 3 for maggie $20");
        System.out.println("press 4 for maggie dosa $40");
        int menu=sc.nextInt();
        switch(menu){
            case 1:
            System.out.println("Enter qty for dosa==");
            int qty=sc.nextInt();
            System.out.println("your bill is==" +qty*30);
            break;
            case 2:
            System.out.println("Enter qty for pizza==");
            int qty1=sc.nextInt();
            System.out.println("your bill is==" +qty1*35);
            break;
            case 3:
            System.out.println("Enter qty for maggie==");
            int qty2=sc.nextInt();
            System.out.println("your bill is==" +qty2*20);
            break;
            case 4:
            System.out.println("Enter qty for maggie dosa==");
            int qty3=sc.nextInt();
            System.out.println("your bill is==" +qty3*40);
            break;
            default:
            System.out.println("error");

        }
        

        
    }
    
}
