
import java.util.Scanner;

public class pattern_0_and_1_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
}
