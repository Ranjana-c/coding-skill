import java.util.*;
class ReverseStr{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    String s=n.nextLine();
    String str="";
    String str2="";
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      if(Character.isLetter(c))
      str=c+str;
    }int y=0;
    for(int j=0;j<s.length();j++){
      char f=s.charAt(j);
      if(Character.isLetter(f))
      {
      f=str.charAt(y);y++;}
      str2=str2+f;  
    }
    System.out.print(str2);
  }
}