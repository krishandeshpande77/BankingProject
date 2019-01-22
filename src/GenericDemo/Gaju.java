package GenericDemo;
import java.util.*;
public class Gaju
{
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		
		List<String>l=new ArrayList<>();
		l.add("a");
		l.add("b");
		
		List<Object>india=new ArrayList<>();
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
