package practice_1;
import java.util.*;
 class KObject{
	float p,w,r;
}
public class KnapsackGreedy {
	static int MAX=20;
	static float M;
	static int n;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of objects");
		n=sc.nextInt();
		KObject[] kob=new KObject[n];
		for(int i=0;i<n;i++)
		{
			kob[i]=new KObject();
		}
		ReadObjects(kob);
		Knapsack(kob);	
	}
	 static void Knapsack(KObject[] kob) {
		 float x[]=new float[MAX];
		 float U;
		 int i;
		 float totalprofit=0;
		 U=M;
		 for( i=0;i<n;i++)
			 x[i]=0;
		 for(i=0;i<n;i++) {
			 if(kob[i].w>U)
				 break;
			 else
			 {
				 x[i]=1;
				 totalprofit+=kob[i].p;
				 U-=kob[i].w;
			 }
		 }
		 System.out.println("i:"+i);
		 if(i<n)
			 x[i]=U/kob[i].w;
		 totalprofit=(x[i]*kob[i].p);
		 System.out.println("soln vector x[]=");
		 for( i=0;i<n;i++)
			 System.out.print(x[i]+" ");
	
		 System.out.println("ttl profit="+totalprofit);
}		
	 static void ReadObjects(KObject[] kob) {
		 KObject temp=new KObject();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter max capacity");
		 M=sc.nextFloat();
		 System.out.println("enter weight");
		 for(int i=0;i<n;i++)
			 kob[i].w=sc.nextFloat();
		 System.out.println("enter profits");
		 for(int i=0;i<n;i++)
			 kob[i].p=sc.nextFloat();
		 for(int i=0;i<n;i++)
			 kob[i].r=kob[i].p/kob[i].w;
		 for(int i=0;i<n-1;i++)
			 for(int j=0;j<n-i-1;j++)
				 if(kob[j].r<kob[j+1].r)
				 {
					 temp=kob[j];
					 kob[j]=kob[j+1];
					 kob[j+1]=temp;
				 }
	}
	
}
