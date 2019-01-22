package TreeSetDemo;

import java.util.*;

public class StudentDefaultSort 
{
	public static void main(String[] args) 
	{
		Set<Student> s=new TreeSet<>();
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("Krishna");
		s.add(s1);
		Student s2=new Student();
		s2.setRollno(1);
		s2.setName("Gaju");
		s.add(s2);
		
		/*System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		System.out.println(s2.getRollno());
		System.out.println(s2.getName());*/
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Student s7=(Student)itr.next();
			System.out.println(s7.getRollno());
			System.out.println(s7.getName());
		}
		
	}
}
