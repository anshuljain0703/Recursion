import java.util.Scanner;
public class Power {
    public static int power(int p,int q){
        if(q==0) return 1;
        if(q%2==0){
            return power(p,q/2);

        }
        return  power(p,q/2)*power(p,q/2)*p;
        
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter p:");
        int p=sc.nextInt();
        System.out.println("Enter q");
        int q=sc.nextInt();
       int ans =power(p,q);
       System.out.println(ans);
    }
     
}
