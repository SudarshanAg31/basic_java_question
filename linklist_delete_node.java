public class linklist_delete_node {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void delete(node n2){
        n2.data=n2.next.data;
        n2.next=n2.next.next;
    }
    public static void main(String[] args) {
        node n1=new node(1);
        node n2=new node(2);
        node n3=new node(3);
        node n4=new node(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        delete(n2);
        while(n1!=null){
            System.out.println(n1.data+" ");
            n1=n1.next;
        }
    }
}
