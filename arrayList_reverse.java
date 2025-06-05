import java.util.ArrayList;
import java.util.Scanner;
public class arrayList_reverse {
    public static void reverse(ArrayList<Integer>l1,int start ,int end) {
        while(start<end){
            int temp=l1.get(start);
            l1.set(start,l1.get(end));
            l1.set(end,temp);
            start++;
            end--;
        }
        System.out.println(l1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>l1=new ArrayList<>();
        for(int i=0;i<5;i++){
            int x=sc.nextInt();
            l1.add(x);
        }
        reverse(l1,0,l1.size()-1);
    }
}
