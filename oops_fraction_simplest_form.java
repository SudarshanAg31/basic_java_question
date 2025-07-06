public class oops_fraction_simplest_form {
    public static fraction add(fraction fra, fraction fra1){
        int num=fra.num*fra1.den+fra.den*fra1.num;
        int den=fra.den*fra1.den;
        fraction f3=new fraction(num,den);
        return f3;  
    }
    public static class fraction{ 
        public static int gcd(int num,int den) {
        for(int i=num;i>=1;i--){
            if(num%i==0&&den%i==0){
                return i; 
            }
        }
        return 1;
    }
    int num;
    int den;
    public fraction(int num,int den){
        this.num=num;
        this.den=den;
        simplify();
    }
    public void simplify(){
        int hcf=gcd(num,den);
        num/=hcf;
        den/=hcf;
    }
}
    public static void main(String[] args) {
        fraction fra=new fraction(9, 12);
        System.out.println(fra.num+"/"+fra.den);
        fraction fra1=new fraction(6, 12);
        System.out.println(fra1.num+"/"+fra1.den);
        fraction fra3=add(fra,fra1);
        System.out.println(fra3.num+"/"+fra3.den);

    }
}
