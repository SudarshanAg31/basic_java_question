public class string_substring_palindrom {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("abc");
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                StringBuilder gtr=new StringBuilder(str.substring(i, j));
                StringBuilder rev=new StringBuilder(gtr);
                rev=rev.reverse();
                if(gtr.toString().equals(rev.toString())){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
