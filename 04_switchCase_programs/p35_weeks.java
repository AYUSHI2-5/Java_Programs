
import java.util.Scanner;

public class p35_weeks {
public static void main(String[] args) {
    System.out.println("weeks");
    Scanner sc=new Scanner(System.in);
    System.out.println("press button number==");
    int Button=sc.nextInt();
    
    switch (Button) {
        case 1:
            System.out.println("monday");

            break;
        case 2:
        System.out.println("tuesday");
        break;
        case 3:
        System.out.println("wednesday");
        break;
        case 4:
        System.out.println("thursday");
        break;
        case 5:
        System.out.println("friday");
        break;
        case 6:
        System.out.println("saturday");
        break;
        case 7:
        System.out.println("sunday");
        default:
            System.out.println("not a valid week");
    }
}    
}
