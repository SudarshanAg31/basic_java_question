public class linklist_nth_node_from_end {
        public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
        public static node nthnode(node n1,int idx) {
            node temp=n1;
            int size=0;
            while(temp!=null){
                temp=temp.next;
                size++;
            }
            temp=n1;
            for(int i=1;i<=size-idx;i++){
                temp=temp.next;
            }
            return temp;
        }
        public static node nthnode_op(node n1,int idx) {
            node slow=n1;
            node fast=n1;
            for(int i=1;i<=idx;i++){
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
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

        int idx=3;

        node temp=nthnode(n1,idx);//this is n^2 time
        System.out.println(temp.data);
        node temp1=nthnode_op(n1, idx);//this take nth order
        System.out.println(temp1.data);
    }
}
