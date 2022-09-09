package practice_1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class QuickSortComplexity {
	final static int MAX=10005;
	static int a[]=new int [MAX];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		System.out.println("enter array elements");
		Random random=new Random();
		for(int i=0;i<n;i++)
			//a[i]=sc.nextInt();
			a[i]=random.nextInt(10000);
		long startTime=System.nanoTime();
		QuickSortAlgo(0,n-1);
		long stopTime=System.nanoTime();
		long elapsedTime=stopTime-startTime;
		//a=Arrays.copyOf(a, n);
		//Arrays.sort(a);
		System.out.println("sorted array");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("time complexity in ms="+(double)elapsedTime/1000000);
	}
	static void QuickSortAlgo(int p, int r) {
		int i,j,temp,pivot;
		if(p<r)
		{
			i=p;
			j=r+1;
			pivot=a[p];
			while(true)
			{
				i++;
				while((a[i]<pivot)&&i<r)
					i++;
				j--;
				while(a[j]>pivot)
					j--;
				if(i<j)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				else 
					break;
			}
			a[p]=a[j];
			a[j]=pivot;
			QuickSortAlgo(p,j-1);
			QuickSortAlgo(j+1,r);
		}
		
	}

}
