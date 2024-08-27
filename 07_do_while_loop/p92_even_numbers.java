import java.util.Scanner;

public class p92_even_numbers {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i=1;
        do  {
           if(i%2==0){
            System.out.println(+i);
           
           }
           i++;
        }while(i<=n);
    }
    
    
}
