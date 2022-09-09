package practice_1;
import java.util.*;
public class KnapsackDP {
	final static int MAX=20;
	static int w[];
	static int p[];
	static int V[][];
	static int n,M;
	static int keep[][];
	public static void main(String[] args) {
		w=new int[MAX];
		p=new int[MAX];
		V=new int[MAX][MAX];
		keep=new int[MAX][MAX];
		int optsoln;
		ReadObj();
		for(int i=0;i<=M;i++)
			V[0][i]=0;
		for(int j=0;j<=n;j++)
			V[j][0]=0;
		optsoln=Knapsack();
		System.out.println("optimum soln="+optsoln);
	}
	 static int Knapsack(){
		 int r;
		 for(int i=1;i<=n;i++)
			 for(int j=0;j<=M;j++)
				 if((w[i]<=j)&&(p[i]+V[i-1][j-w[i]]>V[i-1][j])) {
					 V[i][j]=p[i]+V[i-1][j-w[i]];
					 keep[i][j]=1;
				 }
				 else {
					 V[i][j]=V[i-1][j];
					 keep[i][j]=0;
				 }
		 r=M;
		 System.out.println("items");
		 for(int i=n;i>0;i--)
			 if(keep[i][r]==1)
			 {
				 System.out.print(i+" ");
				 r=r-w[i];
			 }
		 System.out.println();
		 return V[n][M];		 
	}
	 static void ReadObj() {
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("enter max capacity");
		 M=scanner.nextInt();
		 System.out.println("enter no of elements");
		 n=scanner.nextInt();
		 System.out.println("enter weights");
		 for(int i=1;i<=n;i++)
			 w[i]=scanner.nextInt();
		 System.out.println("enter profits");
		 for(int i=1;i<=n;i++)
			 p[i]=scanner.nextInt();		
	}
}
