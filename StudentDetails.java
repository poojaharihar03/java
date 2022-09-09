package practice_1;
import java.util.*;
class Student{
	String USN,Name,Branch,Phone;
	Scanner input=new Scanner(System.in);
	void read() {
		System.out.println("enter details");
		System.out.println("enter usn");
		USN=input.nextLine();
		System.out.println("enter name");
		Name=input.nextLine();
		System.out.println("enter branch");
		Branch=input.nextLine();
		System.out.println("enter phone no");
		Phone=input.nextLine();
	}
	void display() {
		System.out.format("%-20s %-20s %-20s %-20s", USN,Name,Branch,Phone);
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter on of student details");
		n=input.nextInt();
		Student s[]=new Student[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
			s[i].read();
		}
		System.out.format("%-20s %-20s %-20s %-20s", "USN","Name","Branch","Phone");
		for(int i=0;i<n;i++)
		{
			System.out.println();
			s[i].display();
		}
	}

}
