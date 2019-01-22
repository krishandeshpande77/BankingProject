package MapDemo;
import java.util.*;
public class CityUsingMap 	
{
		public static void main(String[] args) 
		{
			List<String> ma = new ArrayList<>();
			ma.add("Aurangabad");
			ma.add("Pune");
			ma.add("Mumbai");
			List<String> jh = new ArrayList<>();
			jh.add("Ranchi");
			jh.add("Abc");
			Map<String,List<String>> india =new HashMap<>();
			india.put("Maharashtra",ma);
			india.put("Jaharkhand",jh);
			Set<String>keys=india.keySet();
			Iterator itr=keys.iterator();
			while(itr.hasNext())
			{
				String s=(String)itr.next();
				System.out.println(s);
				List<String> s1=india.get(s);
				Iterator itr1=s1.iterator();
				while(itr1.hasNext())
				{
					String s4=(String)itr1.next();
					System.out.println(s4);
				}
				
				
			}
		}

}
