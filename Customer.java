package practice_1;
import java.util.*;
public class Customer {
	public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	String name;
	System.out.println("enter name and dob");
	name=scanner.next();
	StringTokenizer st=new StringTokenizer(name,",/");
	int count=st.countTokens();
	for(int i=1;i<=count && st.hasMoreTokens();i++)
	{
		System.out.print(st.nextToken());
		if(i<count)
			System.out.print(",");
	}
	
	System.out.println(name);
}
	
}
