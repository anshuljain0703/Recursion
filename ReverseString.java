import java.util.Scanner;
public class ReverseString {
    static String reversestring(String s){
        if(s.length()==0) return " ";
        String smallAns=reversestring(s.substring(1));
        return smallAns+s.charAt(0);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       System.out.println(reversestring(s));
    }
    
}
