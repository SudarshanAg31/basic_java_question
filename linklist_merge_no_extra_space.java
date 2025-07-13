public class linklist_merge_no_extra_space {
        public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static node linklist(node n1,node n4) {
        node h1=n1;
        node h2=n4;
        node n=new node(100);
        node t=n;
        
        while(h1!=null&&h2!=null){
            if(h1.data<h2.data){
                t.next=h1;
                t=h1;
                h1=h1.next;
            }
            else{
                t.next=h2;
                t=h2;
                h2=h2.next;
            }
        }
        if(h1==null){
            t.next=h2;
        }
        else{
            t.next=h1;
        }
        return n.next;
    }
    public static void main(String[] args) {
        node n1=new node(1);
        node n2=new node(3);
        node n3=new node(5);

        node n4=new node(2);
        node n5=new node(4);
        node n6=new node(6);     
        
        n1.next=n2;
        n2.next=n3;

        n4.next=n5;
        n5.next=n6;
        node temp=linklist(n1, n4);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}



