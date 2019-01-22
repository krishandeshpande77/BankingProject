package GenericDemo;

import java.util.ArrayList;
import java.util.List;

public class Demo3 
{
	public static void main(String[] args) 
	{
		List list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		List l=new ArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		
		List india=new ArrayList<>();
		india.add(list);
		india.add(l);
		
		for(Object o:india)
		{
			List l1=(List)o;
			for(Object o1:l1)
			{
				System.out.println(o1);
			}
		}
	}
}

