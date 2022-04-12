import java.util.*;
public class displaydigits {
    public static void main(String args[]) {
        int n,r;
        System.out.println("enter value of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
       

    sc.close();        
    }
    
}
