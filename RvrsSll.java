import java.util.*;
class RvrsSll{
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
    temp=temp.next;}temp.next=newnode;
  }}
  public int count(){
    Node temp=head;int c=0;
    while(temp!=null){
      c++;
      temp=temp.next;
    }return c;
  }
  public void rev(){
    Node temp=head;
  int g=count()/2;
  int e=count()%2;
    int i=0;
    if(e==0){
    while(i<g){
      System.out.print(temp.data+" ");
      i++;
      temp=temp.next;
    }
    Node cur=temp;
    Node prev=null;
    while(cur!=null){
      Node nex=cur.next;
      cur.next=prev;
      prev=cur;
      cur=nex;
    }
    head=prev;
    Node f=head;
    while(f!=null){
      System.out.print(f.data+" ");
      f=f.next;
    }}else{while(i<=g){
      System.out.print(temp.data+" ");
      i++;
      temp=temp.next;
    }
      Node cur=temp;
      Node prev=null;
      while(cur!=null){
    Node nex=cur.next;cur.next=prev;prev=cur;cur=nex;}head=prev;
      Node f=head;
      while(f!=null){
System.out.print(f.data+" ");
f=f.next;
    }}
  }
  sll(){
    head=null;
  }
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    sll list=new sll();
    int r=0;
    while(true){
      r=n.nextInt();
      if(r==-1)
     { break;}
      list.end(r);
    }
  list.rev(); 
  }
}
