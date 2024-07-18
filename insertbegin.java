import java.util.*;
    public class insertion{
        Node head;
        Node tail;

        class Node{
            int data;
            Node next;
            Node prev;

            Node(int val){
                data = val;
                next = null;
                prev = null;
            }
        }
        insertion(){
            head = null;
            tail =null;
        }
        
        public void insertbegin(int k) {
            Node newnode=new Node(k);
            
            if(head==null) {
                tail = newnode;
            }else {
                newnode.next = head;
                head.prev = newnode;
            }
            head = newnode;
        }
        public void insertposition(int pos,int d) {
            Node newnode=new Node(d);
            Node temp=head;
            for(int i=1;i<pos;i++) {
                temp=temp.next;
            }
            newnode.next = temp.next;
            temp.next.prev = newnode;
            
            temp.next = newnode;
            newnode.prev = temp;
        }
        public void display(){
            Node temp = tail;
            
            while(temp!= null){
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            }
        public static void main(String[] args) {
            Scanner n=new Scanner(System.in);
            insertion list=new insertion();
            list.insertbegin(10);
            list.insertbegin(20);
            list.insertbegin(30);
            list.insertbegin(40);
            list.insertbegin(50);
           
            list.display();
   }
}
