import java.util.*;
class MidSll{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int val){
      data=val;
      next=null;
    }
    }
    public void end(int k){
      Node newnode=new Node(k);
      if(head==null)
      head=newnode;
      else{
      Node temp=head;
      while(temp.next!=null){
  temp=temp.next;
    }temp.next=newnode;}}
    sll(){
      head=null;
    }
    public int count(){
      Node temp=head;
      int u=0;
      while(temp!=null){
  temp=temp.next;u++;  }
  return u;
      }
  public void find(){
    Node temp=head;
    int i=0;
    int y=count()/2;
    while(i<y-1){
      temp=temp.next;i++;
    }
    System.out.print(temp.data);
  }
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    sll list=new sll();
    int j;
    while(true){
      j=n.nextInt();
      list.end(j);
      if(j==-1)
      break;
    }
    list.find();
  }
}
