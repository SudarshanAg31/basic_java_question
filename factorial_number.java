
import java.util.Scanner;

public class factorial_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int pro=1;
        for(int i=1;i<=x;i++){
            pro=i*pro;
        }
        System.out.println(pro);
    }
}
