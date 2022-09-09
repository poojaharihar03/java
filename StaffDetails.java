package practice_1;
import java.util.*;
class Staff{
	String StaffID,Name,Phone,Salary;
	Scanner input=new Scanner(System.in);
	void read() {
		System.out.println("enter staff details");
		System.out.println("enter StaffID");
		StaffID=input.nextLine();
		System.out.println("enter Name");
		Name=input.nextLine();
		System.out.println("enter Phone no");
		Phone=input.nextLine();
		System.out.println("enter Salary");
		Salary=input.nextLine();
	}
	void display() {
		System.out.println("staff details");
		System.out.format("%-15s","STAFFID");
		System.out.format("%-15s",StaffID);
		System.out.println();
		System.out.format("%-15s","NAME");
		System.out.format("%-15s",Name);
		System.out.println();
		System.out.format("%-15s","SALARY");
		System.out.format("%-15s",Salary);
		System.out.println();
		System.out.format("%-15s","PHONE");
		System.out.format("%-15s",Phone);
		System.out.println();
	}
}
class Teaching extends Staff{
	String Publication,Domain;
	void read_Teaching() {
		super.read();
		System.out.println("enter domain");
		Domain=input.nextLine();
		System.out.println("enter publication");
		Publication=input.nextLine();
	}
	void display() {
		super.display();
		System.out.format("%-15s","DOMAIN");
		System.out.format("%-15s",Domain);
		System.out.println();
		System.out.format("%-15s","PUBLICATION");
		System.out.format("%-15s",Publication);
		System.out.println();
	}
}
class Technical extends Staff{
	String Skills;
	void read_Technical() {
		super.read();
		System.out.println("enter Skills");
		Skills=input.nextLine();
	}
	void display() {
		super.display();
		System.out.format("%-15s","SKILLS");
		System.out.format("%-15s",Skills);
		System.out.println();
	}
}
class Contract extends Staff{
	String Period;
	void read_Contract() {
		super.read();
		System.out.println("enter Period");
		Period=input.nextLine();
	}
	void display() {
		super.display();
		System.out.format("%-15s","PERIOD");
		System.out.format("%-15s",Period);
		System.out.println();
	}
}
public class StaffDetails {
	public static void main(String[]args) {
	int n;
	Scanner input=new Scanner(System.in);
	System.out.println("enter no of staff details");
	n=input.nextInt();
	Teaching steach[]=new Teaching[n];
	Technical stech[]=new Technical[n];
	Contract scon[]=new Contract[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("enter teaching details");
		steach[i]=new Teaching();
		steach[i].read_Teaching();
	}
	for(int i=0;i<n;i++)
	{
		System.out.println("enter technical details");
		stech[i]=new Technical();
		stech[i].read_Technical();
	}
	for(int i=0;i<n;i++)
	{
		System.out.println("enter contract details");
		scon[i]=new Contract();
		scon[i].read_Contract();
	}
	//displaying 
	for(int i=0;i<n;i++)
	{
		System.out.println("----TEACHING STAFF DETAILS");
		steach[i].display();
	}
	for(int i=0;i<n;i++)
	{
		System.out.println("----TECHNICAL STAFF DETAILS");
		stech[i].display();
	}
	for(int i=0;i<n;i++)
	{
		System.out.println("----CONTRACT STAFF DETAILS");
		scon[i].display();
	}
	}
}
