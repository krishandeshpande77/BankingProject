package GenericDemo;
import java.util.*;
public class State 
{
	public static void main(String[] args) 
	{
		List<String> mh=new ArrayList<>();
		mh.add("Aurangabad");
		mh.add("Pune");
		mh.add("Nanded");
		
		List<String>jh=new ArrayList<>();
		jh.add("NNNNN");
		jh.add("MMMM");
		
		List<String>k=new ArrayList<>();
		k.add("JJJJ");
		k.add("Mmm");
		
		List<String>s1=new ArrayList<>();
		s1.add("ggg");
		s1.add("uuuu");
		
		List<List<String>>india=new ArrayList<>();
		india.add(mh);
		india.add(jh);
		
		List<List<String>>nepal=new ArrayList<>();
		nepal.add(k);
		nepal.add(s1);
		
		List<List>world=new ArrayList<>();
		world.add(india);
		world.add(nepal);
		
		Iterator itr=world.iterator();
		while(itr.hasNext())
		{
			List l1=(List)itr.next();
			Iterator<List>itr1=l1.iterator();
			while(itr1.hasNext())
			{
				List l2=(List)itr1.next();
				Iterator itr2=l2.iterator();
				while(itr2.hasNext())
				{
					String ss=(String)itr2.next();
					System.out.println(ss);
				}
			}
		}
		/*for(Object o:world)
		{
			List l=(List)o;
			for(Object o1:l)
			{
				List l1=(List)o1;
				for(Object s2:l1)
				{
				   
				System.out.println(s2);
				}
			}
		}*/
		
	}
}
