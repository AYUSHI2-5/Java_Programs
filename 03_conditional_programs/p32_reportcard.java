
import java.util.Scanner;

public class p32_reportcard {
    public static void main(String[] args) {
        System.out.println("report card");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks for english");
        int eng=sc.nextInt();
        System.out.println("enter marks for sci");
        int sci=sc.nextInt();
        System.out.println("Enter marks for maths");
        int maths=sc.nextInt();
        System.out.println("your total is here");
        int total=eng+sci+maths;
        System.out.println("total==" + total);
        if(total>100){
            System.out.println("great!");
        }
        else if(total>50 && total<100){
            System.out.println("do hard work");
        }
        else{
            System.out.println("fail");
        }
            
        
    }
    
}
