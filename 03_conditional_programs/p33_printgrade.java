
import java.util.Scanner;

public class p33_printgrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("print grades accordint to their scores");
        System.out.println("Enter marks for english");
        int eng=sc.nextInt();
        System.out.println("Enter marks for phy");
        int phy=sc.nextInt();
        System.out.println("Enter marks for chem");
        int chem=sc.nextInt();
        System.out.println("your total is here");
        int t=eng+phy+chem;
        System.out.println("total==" +t);
        if(t>100){
            System.out.println("A");
        }
        else if (t<100 && t>50) {
            System.out.println("B");
            
        }
        else{
            System.out.println("C");
        }



    }
    
}
