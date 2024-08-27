import java.util.Scanner;

public class p83_multiplication_reverse {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int m=1;
        int i=n;
        while(i>=1){
            System.out.println(+i);
            m*=i;
            i--;

        }
        System.out.println("multiplication of numbers are=" +m);
       
    }
    
}

    

