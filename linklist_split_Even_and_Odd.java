public class linklist_split_Even_and_Odd {
        public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static node linklist(node n1) {
        node h1=n1;
        node h2=new node(100);
        node t=h2;
        node odd=n1;
        while(h1!=null){
            if(h1.data%2==0){
                node n=new node(h1.data);
                t.next=n;
                t=n;
                odd.next=h1.next;
            }
            else if(h1.data%2!=0){
            odd=odd.next;
            }
            h1=h1.next;
        }
        t.next=n1;
        return h2.next;
    }

    public static void main(String[] args) {
        node n1=new node(1);
        node n2=new node(2);
        node n3=new node(3);
        node n4=new node(4);
        node n5=new node(5);
        node n6=new node(6);     
        
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        node temp=linklist(n1);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
