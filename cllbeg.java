import java.util.*;
class cll{
    Node last;
    class Node{
        int data;
        Node next;
        
        Node(int val){
            data = val;
            next = null;
       }
    }
    cll(){
        last = null;
    }
    public void insbeg(int k){
        Node newnode=new Node(k);
        
        if(last==null) {
            newnode.next = newnode;
            last = newnode;
        }else {
            newnode.next = last.next;
            last.next = newnode;
        }
    }
    public void dis() {
        Node temp = last.next;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        while(temp!= last.next);
    }
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
        cll list = new cll();
        while(true){
            int j = s.nextInt();
            if(j==-1){
                break;
            }else{
                list.insbeg(j);
            }
            list.dis();
        }
    }
}
