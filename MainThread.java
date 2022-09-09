package practice_1;
import java.util.*;
 class squareThread implements Runnable{
	int x;
	squareThread(int x){
		this.x=x;
	}
	public void run() {
		System.out.println("thread name=square Thread the square of "+x+"is ="+x*x);
	}
}
 class cubeThread implements Runnable{
	int x;
	cubeThread(int x){
		this.x=x;
	}
	public void run() {
		System.out.println("thread name=vuve Thread the cube "+x+"is ="+x*x*x);
	}
}
 class RandomThread implements Runnable{
	String tname;
	Thread t1,t2;
	Random r;
	public void run() {
		int num=0;
		r=new Random();
		try {
			while(true)
			{
				num=r.nextInt(100);
				System.out.println("main thread and generated thread="+num);
				t1=new Thread(new squareThread(num));
				t1.start();
				t2=new Thread(new cubeThread(num));
				t2.start();
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
public class MainThread {
	public static void main(String[] args) {
		RandomThread a = new RandomThread();
		Thread threadx = new Thread(a);
		threadx.start();
		}
}
