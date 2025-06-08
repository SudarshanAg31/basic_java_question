import java.util.Scanner;
public class resursion_n_to_1 {
    public static void printdec(int x) {
        if(x==1){
            System.out.println(1);
        return;
        }
        System.out.println(x);
        printdec(x-1);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        printdec(x);

    }
}
