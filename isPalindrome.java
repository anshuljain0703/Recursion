import java.util.Scanner;
public class isPalindrome{

  static String reversestring(String s){  
        if(s.length()==1) {
            System.out.println("Is Palindrome!");
        }
          String smallAns=reversestring(s.substring(1));
        return smallAns+s.charAt(0);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
     String ans=reversestring(s);
       if(ans==s){
        System.out.println("String is Palindrome!");
       }else{
        System.out.println("Not a Palindrome!");
       }
    }
    
}
