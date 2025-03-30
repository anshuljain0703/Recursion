import java.util.Scanner;
public class AlternateSign {
    public static int sign(int n){
        if(n==0) return 0;
        if(n%2==0){
           return sign(n-1)-n;
        }
        return sign(n-1)+n;

    }
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of n:");
    int n=sc.nextInt();
   int ans= sign(n);
   System.out.println(ans);
}
}
