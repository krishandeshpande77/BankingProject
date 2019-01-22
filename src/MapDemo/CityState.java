package MapDemo;
import java.util.*;
public class CityState
{
	public static void main(String[] args)
	{
		List<String> maha=new ArrayList<>();
		maha.add("Aurangabad");
		maha.add("Mumbai");
		maha.add("Pune");
		maha.add("Nanded");
		List<String> g=new ArrayList<>();
		g.add("Surat");
		g.add("Ahmedabad");
		g.add("Vadodara");
		g.add("Bhuj");
		Map<String,List<String>> state1=new HashMap<>();
		state1.put("Maharashtra",maha);
		state1.put("Gujarat",g);
		Map<String,Map<String,List<String>>> india=new HashMap<>();
		india.put("India",state1);
		
		Set<String> keys=india.keySet();
		Iterator itr=keys.iterator();
		//System.out.println(keys);
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
			@SuppressWarnings("rawtypes")
			Map m=india.get(s);
			//String s1=(String)india.get(s);
			@SuppressWarnings("unchecked")
			Set<String> keys1=m.keySet();
			@SuppressWarnings("rawtypes")
			Iterator itr1=keys1.iterator();
			while(itr1.hasNext())
			{
				String s2=(String)itr1.next();
				System.out.println(s2);
						
				@SuppressWarnings("rawtypes")
				List lst=(List) m.get(s2);
				//System.out.println(lst);
				@SuppressWarnings("rawtypes")
				Iterator it=lst.iterator();
				while(it.hasNext())
				{
					String ss=(String)it.next();
					System.out.println(ss);
				}
				//String s3=(String)state1.get(s2);
				
					//	System.out.println(s+"  "+s1);
		}
	}
}}
