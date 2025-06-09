import java.util.Scanner;
public class recursion_sum_digit {
    static int sumdigit(int x){//1234 123 12 1
    if(x<10){//f f f t
        return x;//1
    }
    int y=sumdigit(x/10);//123 12 1
    int ans=y+x%10; 
    return ans;

}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int ans=sumdigit(x);
        System.out.println(ans);
    }
}
