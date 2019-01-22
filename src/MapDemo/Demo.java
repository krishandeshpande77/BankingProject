package MapDemo;
import java.util.*;
public class Demo 
{
	public static void main(String[] args) 
	{
		Map m=new HashMap();
		m.put(1,"Java");
		m.put(2,"c++");
		m.put(3,"c");
		m.put(4,"Vb");
		m.put(5,"PHP");
		
		Set keys=m.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			int a=(int)itr.next();
			String s=(String)m.get(a);
			System.out.println(a+"  "+s);
		}
		
	}
}
