package practice_1;
import java.util.*;
public class DijkstrasClass {
	final static int MAX=20;
	final static int infinity=9999;
	static int a[][];
	static int n;
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[]args) {
		ReadMatrix();
		int s=0;
		System.out.println("enter starting vertex");
		s=scanner.nextInt();
		Dijkstras(s);
	}
	 static void ReadMatrix() {
		 a=new int[MAX][MAX];
		 System.out.println("enter no ");
		 n=scanner.nextInt();
		 System.out.println("enter adjacency matrix");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				a[i][j]=scanner.nextInt();
			}
		}
	}
	static void Dijkstras(int s) {
		int S[]=new int[MAX];
		int d[]=new int[MAX];
		int i,u,v;
		for(i=1;i<=n;i++)
		{
			S[i]=0;
			d[i]=a[s][i];
		}
		S[s]=1;
		d[s]=1;
		i=2;
		while(i<=n)
		{
			u=Extract_Min(S,d);
			S[u]=1;
			i++;
			for(v=1;v<=n;v++)
			{
				if(((d[u]+a[u][v]<d[v])&&(S[v]==0)))
					d[v]=d[u]+a[u][v];
			}
		}
		for(i=1;i<=n;i++)
			if(i!=s)
				System.out.println(i+":"+d[i]);
	}
	 static int Extract_Min(int S[],int d[]) {
			int i,j=1;
			int min=infinity;
			for(i=1;i<=n;i++)
			{
				if((d[i]<min)&&(S[i]==0))
				{
					min=d[i];
				    j=i;
				}
			}
			return (j);
		}
	}