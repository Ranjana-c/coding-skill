import java.util.*;
class Fibonacci{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int h=n.nextInt();
    int p=0,pe=0,f=1;
    for(int i=0;i<h;i++){
      System.out.print(f+" ");
      p=f;
      f=f+pe;
      pe=p;     
    }
  }
}