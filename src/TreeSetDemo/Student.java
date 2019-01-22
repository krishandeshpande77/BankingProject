package TreeSetDemo;

public class Student implements Comparable
{
	private int rollno;
	private String name;
	
	
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	@Override
	public int compareTo(Object o) 
	{
		Student s= (Student)o;
		return this.rollno-s.rollno;
		
	}
	
}
