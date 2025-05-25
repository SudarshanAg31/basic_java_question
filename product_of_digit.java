import java.util.Scanner;
public class product_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int pro=1;
        while(x!=0){
            int y=x%10;
            if (y!=0){
            pro*=y;
            }
            x=x/10;
        }
        System.out.println(pro);
    }
}
