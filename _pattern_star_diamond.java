
import java.util.Scanner;

public class _pattern_star_diamond {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=x/2;
        for (int i=1;i<=y+1;i++){
            for(int j=1;j<=y+1-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*"+" ");
            }
        System.out.println("");
        }
        for (int i=1;i<=y;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=((y*2)-(2*i)+1);j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}
