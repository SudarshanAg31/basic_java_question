public class linklist_mid_ele {
        public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void linklist(node n1) {
        node slow=n1;
        node fast=n1;
       while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data); 
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
    }
}
