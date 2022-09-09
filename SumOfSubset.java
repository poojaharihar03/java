package practice_1;
import java.util.*;
public class SumOfSubset {
	final static int MAX=10;
	static int n;
	static int soln[];
	static int S[];
	static int d;	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		S=new int [MAX];
		soln=new int [MAX];
		int sum=0;
		System.out.print("enter no of elements");
		n=scanner.nextInt();
		System.out.print("enter elements in increasing order");
		for(int i=1;i<=n;i++)
			S[i]=scanner.nextInt();
		System.out.println("enter max value of sum of subset(d)");
		d=scanner.nextInt();
		for(int i=1;i<=n;i++)
			sum+=S[i];
		if((S[1]>d)||(sum<d))
			System.out.println("subset not possible");
		else
			SumOfSub(0,0,sum);
	}
	static void SumOfSub(int i,int weight,int total) {
		if(promising(i,weight,total)==true) {
			if(weight==d) {
				for(int j=1;j<=i;j++)
				{
					if(soln[j]==1)
						System.out.print(S[j]+" ");
				}
				System.out.println();
			}
			else {
				soln[i+1]=1;
				SumOfSub(i+1,weight+S[i+1],total-S[i+1]);
				soln[i+1]=0;
				SumOfSub(i+1,weight,total-S[i+1]);
			}			
		}
	}
	static boolean promising(int i,int weight,int total) {
		return ((weight+total>=d)&&(weight==d||weight+S[i+1]<=d));
	}
}
