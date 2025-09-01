
import java.util.*;
public class hashmap_valid_anagram {
    public static void main(String[] args) {
        Map<Character,Integer>mp=new HashMap<>();
        Map<Character,Integer>mp1=new HashMap<>();

        String str1="silent";
        String str2="listen";
        if(str1.length()==str2.length()){
            int i=0;
            while(i!=str1.length()){
                if(mp.containsKey(str1.charAt(i))){
                int x=mp.get(str1.charAt(i));
                x+=1;
                mp.put(str1.charAt(i),x);
                }
                else{
                    mp.put(str1.charAt(i), 1);
                }
                i++;
            }
           int j=0;
            while(j!=str2.length()){
                if(mp1.containsKey(str2.charAt(j))){
                int x=mp1.get(str2.charAt(j));
                x+=1;
                mp1.put(str2.charAt(j),x);
                }
                else{
                    mp1.put(str2.charAt(j), 1);
                }
                j++;
            }
        }
        if(mp.equals(mp1)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
     }
}
