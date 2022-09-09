package practice_1;
import java.util.*;
public class ption {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b;
		double result;
		System.out.println("enter a,b values");
		a=in.nextInt();
		b=in.nextInt();
		try {
			result=a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception caught:Division by 0");
		}
	}

}
