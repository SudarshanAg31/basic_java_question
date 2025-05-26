
import java.util.Scanner;

public class _pattern_odd_number_triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=1;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j*2-1+" ");
            }
            System.out.println("");
        }
    }
}
