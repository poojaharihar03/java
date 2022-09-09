package practice_1;
import java.util.*;
public class KruskalsClass {
	final static int MAX=20;
	static int c[][];
	static int n;
	public static void main(String[] args) {
		ReadMatrix();
		Kruskals();
	}
	 private static void Kruskals() {
		int a=0,b=0,u=0,v=0,i,j,ne=1,min,mincost=0;
		System.out.println("kruskals method");
		while(ne<n)
		{
			min=999;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(c[i][j]<min)
				{
					min=c[i][j];
					a=u=i;
					b=v=j;
				}
			}
		}

		u=find(u);
		v=find(v);
		if(u!=v)
		{
			uni(u,v);
			System.out.println("edge "+ne++ +"( "+a+", "+b+")="+min);
			mincost+=min;
		}
		c[a][b]=c[b][a]=999;
		}
		System.out.println("minimum cost="+mincost);
	}
	 static int find(int i) {
		 int parent[]=new int [9];
		 while(parent[i]==1)
			 i=parent[i];
		return i;
	}
	 static void uni(int i,int j) {
		 int parent[]=new int[9];
		 parent[j]=i;
	 }
	static void ReadMatrix() {
		 Scanner scanner=new Scanner(System.in);
			c=new int[MAX][MAX];
			System.out.println("enter no of vertices");
			n=scanner.nextInt();
			System.out.println("enter adjacency matrix");
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					c[i][j]=scanner.nextInt();
					if(c[i][j]==0)
						c[i][j]=999;
				}
			}
	}

}
