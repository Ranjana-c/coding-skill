import java.util.*;
class code{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=0;
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      int a=c;
      if(a>=48 && a<=57){
        System.out.print(c);
        count+=1;
      }
    }
    if(count==0){
      System.out.print(0);
    }
  }
