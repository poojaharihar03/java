package practice_1;
import java.util.*;
public class Hamiltonian {
	boolean found=false;
	int n;
	int G[][];
	int x[];
	public static void main(String[]args) {
		Hamiltonian hamiltonian=new Hamiltonian();
		hamiltonian.getData();
		System.out.println("solution");
		hamiltonian.HamiltonianMethod(2);
		hamiltonian.printNoPossibleSoln();
	}
	public void printNoPossibleSoln() {
		if(found==false)
			return;
	}
	public void getData() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("hamiltonian cycle");
		System.out.print("enter no of vertices");
		n=scanner.nextInt();
		G=new int [n+1][n+1];
		x=new int [n+1];
		System.out.println("enter 1 if edge is present else 0");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
			{
				if((i!=j)&&(i<j))
				{
					System.out.print(i+"and "+j+" :");
					G[j][i]=G[i][j]=scanner.nextInt();
				}
				if(i==j)
					G[i][j]=0;
			}
		for(int i=1;i<=n;i++)
		{
			x[i]=0;
			x[1]=1;
			scanner.close();
		}
	}
	public void HamiltonianMethod(int k) {
		while(true)
		{
			nextValue(k,G,x,n);
			if(x[k]==0)
				return;
			if(k==n)
			{
				for(int i=1;i<=k;i++)
					System.out.print(x[i]+" ");
			System.out.print(x[1]);
			System.out.println();
			found=true;
			return;
			}
			else
				HamiltonianMethod(k+1);
		}
	}
	void nextValue(int k,int G[][],int x[],int n) {
		while(true)
		{
			x[k]=(x[k]+1)%(n+1);
			if(x[k]==0)
				return;
			if(G[x[k-1]][x[k]]!=0)
			{
				int j;
				for(j=1;j<k;j++)
					if(x[k]==x[j])
						break;
				if(j==k)
					if((k<n)||(k==n)&&G[x[n]][x[1]]!=0)
						return;				
			}
		}
	}
}