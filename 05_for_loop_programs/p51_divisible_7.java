
import java.util.Scanner;

public class p51_divisible_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit==");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%7==0){
                System.out.println(+i);
            }
        }
    }
    
}
