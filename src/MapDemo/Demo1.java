package MapDemo;
import java.util.*;
public class Demo1 
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		@SuppressWarnings("rawtypes")
		Map m=new LinkedHashMap();
		m.put("Maha","Aurangabad");
		m.put("M", "Pune");
		m.put("Mh","Mumbai");
		m.put("Ind","Maharashtra");
		m.put("India","Bihar");
		m.put("In","NewDelhi");
		Set<String>keys=m.keySet();
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			String s1=(String)m.get(s);
			System.out.println(s+"  "+s1);
		}
	}
}
