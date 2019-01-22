package GenericDemo;
import java.util.*;
public class Demo1 
{
	public static void main(String[] args)
	{
		List type1=new ArrayList<>();
		type1.add(10);
		type1.add(20);
		type1.add(30);
		type1.add(40);
		type1.add(50);
		List type2=new ArrayList<>();
		type2.add("SonuNigam");
		type2.add("Shreya Ghoshal");
		type2.add("KumarSanu");
		type2.add("UditNarayan");
		type2.add("ArjitSingh");
		List list=new ArrayList<>();
		list.add(type1);
		list.add(type2);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			List l=(List)itr.next();
			Iterator itr1=l.iterator();
			while(itr1.hasNext())
			{	
				Object o=itr1.next();
				if(o instanceof String)
				{
					String s=(String)o;
					System.out.println(s);
				}
				else if(o instanceof Integer)
				{
					int a=(int)o;
					System.out.println(a);
				}		
			}
			
		}
	}
}


			
