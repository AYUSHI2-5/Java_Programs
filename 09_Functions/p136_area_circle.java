
import java.util.Scanner;

public class p136_area_circle {
    public static void printArea(){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        float area=(float) (r*r*3.14);
        System.out.println(area);
        return;
       
        
        
    }
    public static void main(String[] args) {
        printArea();
    }
    
}
