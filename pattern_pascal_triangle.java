
import java.util.Scanner;

public class pattern_pascal_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<=x;i++){
            for(int j=0;j<=x-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((factorial(i)/(factorial(j)*factorial(i-j)))+" ");
            }
            System.out.println("");
        }
    }
    public static int factorial(int a) {
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
}
