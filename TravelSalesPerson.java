package practice_1;
import java.util.*;
public class TravelSalesPerson {
	final static int MAX=100;
	static int infinity=9999;
	public static void main(String[] args) {
		int cost=infinity;
		int c[][]=new int [MAX][MAX];
		int tour[]=new int[MAX];
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter no of cities");
		n=scanner.nextInt();
		System.out.println("enter adjacency matrix");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{
				c[i][j]=scanner.nextInt();
				if(c[i][j]==0)
					c[i][j]=9999;
			}
		for(int i=0;i<n;i++)
			tour[i]=i;
		cost=tspdp(c,tour,0,n);
		System.out.println("cost is="+cost);
		System.out.println("tour");
		for(int i=0;i<n;i++)
		{
			System.out.print(tour[i]+"->");
		}
		System.out.print(tour[0]);		
		scanner.close();
	}
static int tspdp(int c[][],int tour[],int start,int n) {
	int i,j,k;
	int temp[]=new int[MAX];
	int mintour[]=new int[MAX];
	int mincost;
	int cost;
	if(start==n-2)
		return c[tour[n-2]][tour[n-1]]+c[tour[n-1]][0];
	mincost=infinity;
	for(i=start+1;i<n;i++)
	{
		for( j=0;j<n;j++)
			temp[j]=tour[j];
		temp[start+1]=tour[i];
		temp[i]=tour[start+1];
	if(c[tour[start]][tour[i]]+(cost=tspdp(c,temp,start+1,n))<mincost){
		mincost=c[tour[start]][tour[i]]+cost;
		for(k=0;k<n;k++) {
			mintour[k]=temp[k];}
	}
	}
for(i=0;i<n;i++) {
	tour[i]=mintour[i];
}
return mincost;
}
}
