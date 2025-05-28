
import java.util.Scanner;

public class Permutation_and_Combination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        double a=combination(x, y);
        double b=permutation(x, y);
        System.out.println("permutation: "+b);
        System.out.println("combination: "+a);
    }
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static double combination(int a,int b){
        int y=factorial(a);
        int x=factorial(b);
        int q=factorial(a-b);
        double z=(y/(x*(q)));
        return z;
    }
    public static double permutation(int a,int b) {
        int y=factorial(a);
        int q=factorial(a-b);
        double z=y/q;
        return z;
    }
}