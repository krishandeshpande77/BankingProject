package MapDemo;
import java.util.*;
public class Map1 
{
	public static void main(String[] args) 
	{
		Map<String,Student> m=new HashMap<>();
		Student s=new Student();
		s.setRollno(1);
		s.setName("Krishna");
		m.put("xyz",s);
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("Gaju");
		m.put("pqr", s1);
		Set<String>key=m.keySet();
		//System.out.println(key);
		Iterator itr=key.iterator();
		while(itr.hasNext())
		{
			String s2=(String) itr.next();
			Student s3=m.get(s2);
			System.out.println(s3.getRollno());
			System.out.println(s3.getName());
		}
	}
	
}
