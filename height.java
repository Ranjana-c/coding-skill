import java.util.*;
class code {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int height = s.nextInt();
        int velocity = s.nextInt();
        int fvalue = s.nextInt();
        int en = velocity/fvalue;
        height*= en*en;
        System.out.println(height);


        
    }
}
