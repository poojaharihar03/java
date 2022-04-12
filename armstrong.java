import java.util.*;
public class armstrong {
    public static void main(String args[]){
        int n,sum=0,r;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int m=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+(r*r*r);
        
        }
        if(sum==m)
            System.out.println("yes");
        else
            System.out.println("no");
        sc.close();
    }
    
}
