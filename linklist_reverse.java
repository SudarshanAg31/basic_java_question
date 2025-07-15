public class linklist_reverse {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static node linklist(node n1) {
        if(n1.next==null){
            return n1;
        }
       node temp=linklist(n1.next);
       n1.next.next=n1;
       n1.next=null;
       return temp;
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
