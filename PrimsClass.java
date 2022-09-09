package practice_1;
import java.util.*;
public class PrimsClass {
	final static int MAX=20;
	static int n;
	static int cost[][];
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[]args) {
		ReadMatrix();
		Prims();	
	}
	 static void ReadMatrix() {
		cost=new int[MAX][MAX];
		System.out.println("enter no of vertices");
		n=scanner.nextInt();
		System.out.println("enter adjacency matrix");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
				cost[i][j]=scanner.nextInt();
				if(cost[i][j]==0)
					cost[i][j]=999;
			}
		}
	}
	 static void Prims() {
		int visited[]=new int[10];
		int a=0,b=0,u=0,v=0,i,j,min,mincost,ne=1;
		mincost=0;
		visited[1]=1;
		while(ne<n)
		{
			for(i=1,min=999;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(cost[i][j]<min)
					{
						if(visited[i]!=0)
						{
							min=cost[i][j];
							a=u=i;
							b=v=j;
						}
					}
				}
			}
			if(visited[u]==0||visited[v]==0)
			{
				System.out.println("edge=("+a+","+b+")=cost "+min);
				mincost+=min;
				visited[b]=1;
			}
			cost[a][b]=cost[b][a]=999;
		}
			System.out.println("minimum cost="+mincost);
	}
}