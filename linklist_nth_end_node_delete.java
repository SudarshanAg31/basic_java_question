
public class linklist_nth_end_node_delete {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static node linklist(node n1,int idx){
        node slow=n1;
        node fast=n1;
        for(int i=1;i<=idx;i++){
            fast=fast.next;
        }
        if(fast==null){
            n1=n1.next;
            return n1; 
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return n1;
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

        int idx=6;

        node temp=linklist(n1, idx);
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}
