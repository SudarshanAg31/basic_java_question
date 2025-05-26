
import java.util.Scanner;

public class pattern_star_triangle_ulta {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=(x-i+1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
