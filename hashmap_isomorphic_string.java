
import java.util.*;

public class hashmap_isomorphic_string {
    public static void main(String[] args) {
        Map<Character,Character>mp=new HashMap<>();
        String str1="aax";
        String str2="bbby";
        if(str1.length()==str2.length()){
            int i=0;
            while (i!=str1.length()) { 
                if(mp.containsKey(str1.charAt(i))){
                    if(mp.get(str1.charAt(i))!=str2.charAt(i)){
                        System.out.println("no");
                        return;
                    }
                }
                else{
                    mp.put(str1.charAt(i),str2.charAt(i));
                }
                i++;
            }
        }
        else{
            System.out.println("no");
            return;
        }
        System.out.println("yes");
          
    }
}
