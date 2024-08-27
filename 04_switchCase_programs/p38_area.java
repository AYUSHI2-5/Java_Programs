
import java.util.Scanner;

public class p38_area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
      
        int button=sc.nextInt();
        switch(button){
            case 1:
            System.out.println("enter inputs for area of triangle=");
            int l=sc.nextInt();
            int b=sc.nextInt(); 
            double a1=l*b*0.5;
            System.out.println("area of triangle==" +a1);
            break;
            case 2:
            System.out.println("Enter inputs for area of circle");
            double r=sc.nextDouble();
            double a2=r*r*3.14;
            System.out.println("area of circle==" +a2);
            break;
            default:
            System.out.println("not valid button");
        }
        
    }
    
}
