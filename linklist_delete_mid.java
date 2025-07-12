public class linklist_delete_mid {
        public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void linklist(node n1) {
        if(n1.next==null){
            return;
        }
        node slow=n1;
        node fast=n1;
        while(fast.next.next!=null&&fast.next.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
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
        linklist(n1);
        while(n1!=null){
            System.out.println(n1.data+" ");
            n1=n1.next;
        }
    }
}
