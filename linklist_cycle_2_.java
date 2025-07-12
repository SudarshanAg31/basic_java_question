public class linklist_cycle_2_{
        public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static node linklist(node n1) {
        node slow=n1;
        node fast=n1;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        node temp=n1;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
        return slow;
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
        n6.next=n3;
        node temp=linklist(n1);
        System.out.println(temp.data);
    }
}