package GenericDemo;
import java.util.*;
public class Demo 
{
	
	public static void main(String[] args) 
	{
		List<String>b97=new ArrayList<>();
		List<String>b98=new ArrayList<>();
		List<List<String>>cjc=new ArrayList();
		b97.add("Ganesh");
		b97.add("Mangesh");
	    b97.add("Bhushan");
		b97.add("Gajanan");
		b97.add("Naresh");
		b98.add("Krishna");
		b98.add("Yogesh");
		b98.add("Chetan");
		cjc.add(b97);
		cjc.add(b98);
		for(List<String>list:cjc)
		{
			for(String s:list)
			{
			System.out.println(s);
			}
		}
	}
}
