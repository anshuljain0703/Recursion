import java.util.Scanner;
public class intro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="Apna College";
        System.out.println(s);
        String s1;
        s1=sc.nextLine();
        System.out.println(s1);
        char c=s.charAt(0);
        System.out.println(c);
        System.out.println(s.length());
        System.out.println(s.substring(2, 4));

    }
}
