import java.util.Scanner;

public class p101_odd_even_square_cube {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i=1;
        
        do{
            if(i%2==0){
                System.out.print(+i*i+"+");
                i++;
               
            }
            else{
                System.out.print(+i*i*i+"+");
                i++;
               
            }
        }while(i<=n);
    
}
}
