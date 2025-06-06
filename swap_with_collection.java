import java.util.ArrayList;
import java.util.Collections;

public class swap_with_collection {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(5);
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(1);
        Collections.sort(l1);
        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
        ArrayList<String>l2=new ArrayList<>();
        l2.add("hello");
        l2.add("i");
        l2.add("am");
        l2.add("sudarshan");
        Collections.sort(l2);
        System.out.println(l2);
        Collections.sort(l2,Collections.reverseOrder());
        System.out.println(l2);
    }
}
