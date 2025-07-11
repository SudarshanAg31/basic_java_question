public class linklist_intersection {
        public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void linklist(node n1,node n7) {
        node h1=n1;
        node h2=n7;
        int size=0;
        while(h1!=null){
            h1=h1.next;
            size++;
        }
        h1=n1;
        for(int i=1;i<=size;i++){
            while (h2 != null) {
                if (h1 == h2) {
                    System.out.println(h2.data);
                    return;
                }
                else{
                    h2=h2.next;
                }
            }
            h2=n7;
            h1=h1.next;
        }
    }
    public static void linklist_op(node n1,node n7) {
        node h1=n1;
        node h2=n7;
        int size1=0;
        int size2=0;
        while(h1!=null){
                h1=h1.next;
                size1++;
            }
        while(h2!=null){
                h2=h2.next;
                size2++;
            }
        h1=n1;
        h2=n7;
        int z=size1-size2;
        if(z>0){
            for(int i=1;i<=z;i++){
                h1=h1.next;
            }
        }
        else if(z<0){
            z=Math.abs(z);
            for(int i=1;i<=z;i++){
                h1=h2.next;
            }
        }
        while(h1!=h2){
            h1=h1.next;
            h2=h2.next;
        }
        System.out.println(h1.data);
    }
    public static void main(String[] args) {
        node n1=new node(1);
        node n2=new node(2);
        node n3=new node(3);
        node n4=new node(4);
        node n5=new node(5);
        node n6=new node(6);

        node n7=new node(7);
        node n8=new node(8);      
        
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        
        n7.next=n8;
        n8.next=n4;
        linklist(n1, n7);//T.C is O(n*m);
        linklist_op(n1, n7);//T.C is O(n+m);
    }
}
