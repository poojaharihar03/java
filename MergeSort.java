package practice_1;
import java.util.Random;
import java.util.Scanner;
public class MergeSort {
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
		MergeSortAlgo(0,n-1);
		long stopTime=System.nanoTime();
		long elapsedTime=stopTime-startTime;
		System.out.println("time taken is="+(double)elapsedTime/1000000);
		System.out.println("sorted array is");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
      static void MergeSortAlgo(int low, int high) {
    	  int mid;
    	  if(low<high)
    	  {
    		  mid=(low+high)/2;
    		  MergeSortAlgo(low,mid);
    		  MergeSortAlgo(mid+1,high);
    		  Merge(low,mid,high);

    	  }
		// TODO Auto-generated method stub
		
	}
	 static void Merge(int low, int mid, int high) {
		 int i,j,h,k;
		 int b[]=new int[MAX];
		 i=h=low;
		 j=mid+1;
		 while((h<=mid)&&(j<=high))
			 if(a[h]<a[j])
				 b[i++]=a[h++];
			 else
				 b[i++]=a[j++];
		 if(h>mid)
			 for(k=j;k<=high;k++)
				 b[i++]=a[k];
		 else
			 for(k=h;k<=mid;k++)
				 b[i++]=a[k];
		 for(k=low;k<=high;k++)
			 a[k]=b[k];
	}
}