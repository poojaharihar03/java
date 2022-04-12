import java.util.*;
public class secondLargest {
    public static void main(String args[]) {
        //sum of all elements
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int b[]={3,9,7,8,12,6,15,5,4,10};
        for(int i=0;i<b.length;i++)
        {
            sum+=b[i];
        }
        System.out.println(sum);
        sc.close();

        
    }
    
}
