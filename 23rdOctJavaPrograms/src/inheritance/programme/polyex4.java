// example for array of objects
package inheritance.programme;
class employee
{
	private int emplid;
	private String empname;
	private double salary;
	public employee(int emplid,String empname,double salary)
	{
		this.emplid=emplid;
		this.empname=empname;
		this.salary=salary;
		
		
	}
	public void printempdetails()
	{
		System.out.println("emplid="+emplid);
		System.out.println("empname="+empname);
		System.out.println("salary="+salary);
	}
}

public class polyex4 
{
public static void main(String[] args) 
{
employee emp[]=new employee[3];
emp[0]=new employee(1001,"vinay",3000.25);
emp[1]=new employee(1002,"vikas",4500.75);
emp[2]=new employee(1003,"akash",5500.75);
for(int i=0;i<3;i++)
{
	emp[i].printempdetails();
	System.out.println("*********************");
}

}
}
