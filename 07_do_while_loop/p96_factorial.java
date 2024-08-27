import java.util.Scanner;

public class p96_factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr your limit");
        int n=sc.nextInt();
        int i=1;
      
        do{
            System.out.print("1/"+i+"+");
            i++;
           
        }while(i<=n);
    }
}
