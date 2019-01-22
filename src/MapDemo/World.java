package MapDemo;
import java.util.*;
public class World 
{
	public static void main(String args[])
	{
		List<String> maha=new ArrayList<>();
		maha.add("Aurangabad");
		maha.add("Pune");
		maha.add("Nashik");
		List<String> up=new ArrayList<>();
		up.add("JJJJ");
		up.add("KKK");
		up.add("LLL");
		List<String> mp=new ArrayList<>();
		mp.add("MMM");
		mp.add("HHH");
		mp.add("NNN");
		List<String> bihar=new ArrayList<>();
		bihar.add("eee");
		bihar.add("GGG");
		Map<String,List<String>> india=new HashMap<>();
		india.put("Maharashtra", maha);
		india.put("UtharPradesh",up);
		Map<String,List<String>> usa=new HashMap<>();
		usa.put("United", mp);
		usa.put("Chicago",bihar);
		Map<String,Map<String,List<String>>> world=new HashMap<>();
		world.put("world1",india);
		world.put("world2", usa);
		Set<String> keys=world.keySet();
		//Iterator itr=keys.iterator();
		for(String key:keys)

		{
			System.out.println(key);
			Map<String,List<String>> m=world.get(key);
			Set<String> s1=m.keySet();
			
			for(String s:s1)
			{
				System.out.println(s);
				List<String> list=m.get(s);
				for(String s2:list)
				{
					
					System.out.println(s2);
				}
			}
		}
		
		
	}
}
