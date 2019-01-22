package TreeSetDemo;
import java.util.*;
public class College 
{
	public static void main(String[] args)
	{
		Set<StudentInfo> s=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 For RollNo Sort");
		System.out.println("Press 2 For Name Sort");
		System.out.println("Enter choice for sorting");
		int choice=sc.nextInt();
		switch(choice)
		{
		  case 1:
			   s=new TreeSet(new RollSort());
			   //s.add(st);
			   break;
		  case 2:
			   s=new TreeSet(new NameSort());
			   //s.add(st1);
			   break;
			   
	   }
		StudentInfo st=new StudentInfo();
		st.setRollno(2);
		st.setName("Gaju");
		s.add(st);
		StudentInfo st1=new StudentInfo();
		st1.setRollno(1);
		st1.setName("Abhi");
		s.add(st1);
		for(StudentInfo st2:s)
		{
			System.out.println(st2.getRollno()+"  "+st2.getName());
			
		}
	}
}
