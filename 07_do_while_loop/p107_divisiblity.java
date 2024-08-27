import java.util.Scanner;

public class p107_divisiblity {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");

        int n=sc.nextInt();
        System.out.println("Enter any number");
        int no=sc.nextInt();
         int i=1;
         do{
            if(n%no==0){
                System.out.println(+i);
                i++;
            }
           
        }while(i<=n);
    }
}
