
import java.util.Scanner;

public class _pattern_star_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                if(i+j>x){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println("");
        }
    }
}
